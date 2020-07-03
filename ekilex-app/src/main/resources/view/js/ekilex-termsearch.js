// add on click handlers to details buttons in search result table
function initializeTermSearch() {

	$(document).on("click", ":button[name='meaning-details-btn']", function() {
		var meaningId = $(this).data('id');
		loadMeaningDetails(meaningId);
	});

	$(document).on('click', '.order-up', function() {
		let orderingData = changeItemOrdering($(this), -1);
		postJson(applicationUrl + 'update_ordering', orderingData);
	});

	$(document).on('click', '.order-down', function() {
		let orderingData = changeItemOrdering($(this), 1);
		postJson(applicationUrl + 'update_ordering', orderingData);
	});

	$(document).on('click', '[name="lang-collapse-btn"]', function() {
		let lang = $(this).attr("data-lang");
		let itemData = {
			opCode: "user_lang_selection",
			code: lang
		};
		postJson(applicationUrl + 'update_item', itemData).done(function(data) {
			refreshDetailsTermsSearch();
		});
	});

	$(document).on('click', '#duplicateMeaningBtn', function() {
		let url = applicationUrl + 'duplicatemeaning/' + $(this).data('meaning-id');
		$.post(url).done(function(data) {
			let response = JSON.parse(data);
			if (response.status === 'ok') {
				openMessageDlg(response.message);
				let duplicateMeaningId = response.duplicateMeaningId;
				setTimeout(function() {
					window.location = applicationUrl + 'meaningback/' + duplicateMeaningId;
				}, 1500);
			} else {
				openAlertDlg(response.message);
			}
		}).fail(function(data) {
			openAlertDlg("Mõiste dubleerimine ebaõnnestus");
			console.log(data);
		});
	});

	$(document).on('click', '[name="pagingBtn"]', function() {
		openWaitDlg();
		let url = applicationUrl + "term_paging";
		let button = $(this);
		let direction = button.data("direction");
		let form = button.closest('form');
		form.find('input[name="direction"]').val(direction);

		$.ajax({
			url: url,
			data: form.serialize(),
			method: 'POST',
		}).done(function (data) {
			closeWaitDlg();
			$('#results_div').html(data);
			$('#results_div').parent().scrollTop(0);
			$('#meaning-details-area').empty();
		}).fail(function (data) {
			console.log(data);
			closeWaitDlg();
			openAlertDlg('Lehekülje muutmine ebaõnnestus');
		});

	});

	$(document).on("click", "#activeTagCompleteBtn", function() {
		let meaningId = $(this).data('meaning-id');
		let actionUrl = applicationUrl + "update_meaning_active_tag_complete/" + meaningId;
		$.post(actionUrl).done(function(data) {
			if (data !== "{}") {
				openAlertDlg("Andmete muutmine ebaõnnestus.");
				console.log(data);
			}
			refreshDetailsTermsSearch();
		}).fail(function(data) {
			openAlertDlg("Andmete muutmine ebaõnnestus.");
			console.log(data);
		});
	});

	$(document).on('change', '[name="resultLang"]', function() {
		$(this).closest('form').submit();
	});

	$(document).on('change', '[name="resultMode"]', function() {
		$(this).closest('form').submit();
	});

	$(document).on('show.bs.modal', '#meaningLifecycleLogDlg', function(e) {
		var dlg = $(this);
		var link = $(e.relatedTarget);
		var url = link.attr('href');
		dlg.find('.close').focus();
		dlg.find('.modal-body').html(null);
		$.get(url).done(function(data) {
			dlg.find('.modal-body').html(data);
		});
	});

	var detailsButtons = $('#results').find('[name="meaning-details-btn"]');
	if (detailsButtons.length === 1) {
		detailsButtons.trigger('click');
	}

	initNewWordDlg();
	initClassifierAutocomplete();
};

function loadMeaningDetails(meaningId) {
	$("[id^='meaning_select_point_']").hide();
	$("[id^='meaning_select_wait_']").hide();
	$("#meaning_select_wait_" + meaningId).show();
	openWaitDlg();
	var meaningDetailsUrl = applicationUrl + 'meaningdetails/' + meaningId;
	$.get(meaningDetailsUrl).done(function(data) {
		var detailsDiv = $('#meaning-details-area');
		var scrollPos = detailsDiv.scrollTop();
		detailsDiv.replaceWith(data);
		detailsDiv = $('#meaning-details-area');
		decorateSourceLinks(detailsDiv);
		initClassifierAutocomplete();
		detailsDiv.scrollTop(scrollPos);
		$("#meaning_select_wait_" + meaningId).hide();
		$("#meaning_select_point_" + meaningId).show();
		closeWaitDlg();
		$('[data-toggle="tooltip"]').tooltip();
	}).fail(function(data) {
		console.log(data);
		closeWaitDlg();
		alert('Detailide päring ebaõnnestus, proovige hiljem uuesti.');
	});
};

function refreshDetailsTermsSearch() {
	var refreshButton = $('#refresh-details');
	refreshButton.trigger('click');
};

function doNewSearchTermSearch() {
	$('#simple_search_filter').find('button[type=submit]').trigger('click');
};

function deleteMeaningAndLexemesAndWords() {
	var opName = "delete";
	var opCode = "meaning";
	var meaningId = $(this).attr("data-id");
	var successCallbackName = $(this).attr("data-callback");
	let successCallbackFunc = () => eval(successCallbackName)($(this));

	executeMultiConfirmPostDelete(opName, opCode, meaningId, successCallbackFunc);
};