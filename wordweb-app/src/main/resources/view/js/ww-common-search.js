$(document).ready(function () {

	initialiseRecording(speechRecognitionServiceUrl);


	var selectedHomonymItem = getSelectedHomonym();
	selectedHomonymItem.delay(500).queue(function () {}).trigger('click');
	selectedHomonymItem.addClass("animation-target");
	setSelectedHomonymValueForMobile(getSelectedHomonym().html());


	var searchWordAutocompleteMenuRenderer = function (ul, items) {
		var self = this;
		var groups = [];

		groups = $.map(items, function (item) {
			return item.group;
		});

		groups = $.grep(groups, function (el, index) {
			return index === $.inArray(el, groups);
		});

		ul.addClass("list-group");
		$.each(groups, function (index, group) {
			if (group == "formWord") {
				var li = $("<li>");
				li.addClass("list-group-item list-group-item-info");
				li.text(messages.this_is_form);
				ul.append(li);
			}
			$.each(items, function (index, item) {
				if (item.group == group) {
					self._renderItemData(ul, item);
				}
			});
		});
	};

	var searchWordAutocompleteConfig = {
		source: function (request, response) {
			var wordFrag = request.term;
			var destinLangsStr = $("input[name='destinLangsStr']").val();
			var searchWordFragUrlWithParams = searchWordFragUrl + "/" + destinLangsStr + "/" + wordFrag;
			$.ajax({
				url: searchWordFragUrlWithParams,
				type: "GET",
				success: function (data) {
					var prefWords = data.prefWords;
					var formWords = data.formWords;
					var fullList = [];
					$.each(data.prefWords, function (index, item) {
						fullList.push({
							group: "prefWord",
							label: item,
							value: item
						});
					});
					$.each(data.formWords, function (index, item) {
						fullList.push({
							group: "formWord",
							label: item,
							value: item
						});
					});
					response(fullList);
				}
			});
		},
		minLength: 3,
		create: function () {
			$(this).data('uiAutocomplete')._renderMenu = searchWordAutocompleteMenuRenderer;
		},
		select: function (event, ui) {
			if (ui.item) {
				$("input[name='searchWord']").val(ui.item.value);
				$("#search-btn").click();
			}
			return false;
		},
		open: function () {
			return false;
		},
		close: function () {
			return false;
		}
	};

	$("input[name='searchWord']").autocomplete(searchWordAutocompleteConfig).autocomplete("instance");

});

function playAudio(audioSource, onEndedCallback) {
	var music = new Audio(audioSource);
	music.onended = onEndedCallback;
	music.play();
}

function generateAudioAndPlay(e) {
	var elem = $(e);
	if (elem.data('is-playing') !== undefined) {
		return;
	}
	elem.data('is-playing', '');

	var content;
	var buttonSpeaker = elem.find('.btn-speaker').addBack('.btn-speaker');
	if (buttonSpeaker.length !== 0) {
		content = buttonSpeaker.html();
		buttonSpeaker.html('<i class="fa fa-spinner fa-spin"></i>');
	}
	var onEndCallback = function () {
		elem.removeData('is-playing');
		if (buttonSpeaker.length !== 0) {
			buttonSpeaker.html(content);
		}
	};

	var definedUrlToAudio = elem.data('url-to-audio');
	if (definedUrlToAudio !== undefined) {
		playAudio(definedUrlToAudio, onEndCallback);
		return;
	}

	var data = {
		'words': elem.data('words')
	};
	$.post(applicationUrl + 'generate_audio', data).done(function (providedUrlToAudio) {
		elem.data('url-to-audio', providedUrlToAudio);
		playAudio(providedUrlToAudio, onEndCallback);
	}).fail(function () {
		onEndCallback();
		alert(messages.audio_generation_failure);
	})
}

var audio_context;
var recorder;
var audio_stream;
var ws;
var speechRecognitionServiceUrl;
/**
 * Patch the APIs for every browser that supports them and check if getUserMedia
 * is supported on the browser.
 */
function initialiseRecording(serviceUrl) {
	try {
		speechRecognitionServiceUrl = serviceUrl;
		// Monkeypatch for AudioContext, getUserMedia and URL
		window.AudioContext = window.AudioContext || window.webkitAudioContext;
		navigator.getUserMedia = navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia;
		window.URL = window.URL || window.webkitURL;

		audio_context = new AudioContext;
		var isUserMediaPresent = navigator.getUserMedia ? 'available.' : 'not present!';
		console.log('Audio context is ready !');
		console.log('navigator.getUserMedia ' + isUserMediaPresent);
	} catch (e) {
		console.log('No web audio support in this browser!');
	}
}

function startRecording() {
	// Access the Microphone using the navigator.getUserMedia method to obtain a stream
	navigator.getUserMedia({
		audio: true
	}, function (stream) {
		// Expose the stream to be accessible globally
		audio_stream = stream;
		var input = audio_context.createMediaStreamSource(stream);
		console.log('Media stream succesfully created');

		recorder = new Recorder(input);
		console.log('Recorder initialised');

		// Start recording !
		recorder && recorder.record();
		console.log('Recording...');
	}, function (e) {
		console.error('No live audio input: ' + e);
	});
}

function stopRecording(callback) {
	// Stop the recorder instance
	recorder && recorder.stop();
	audio_stream.getAudioTracks()[0].stop();
	console.log('Stopped recording.');

	// Use the Recorder Library to export the recorder Audio as a .mp3 file
	// The callback providen in the stop recording method receives the blob
	if (typeof (callback) == "function") {
		recorder && recorder.exportWAV(function (blob) {
			callback(blob);
			// Clear the Recorder to start again !
			recorder.clear();
		}, ("audio/mpeg"));
	}
}

function sendToWebSocket(audioBlob) {
	if ("WebSocket" in window) {
		if (ws) {
			ws.close();
			ws = null;
		}
		// Let us open a web socket
		// ws = new WebSocket("ws://localhost:9090/client/ws/speech");
		ws = new WebSocket(speechRecognitionServiceUrl);
		ws.onopen = function () {
			// Web Socket is connected, send data using send()
			ws.send(audioBlob);
			ws.send("EOS");
			console.log("Message is sent...");
		};

		ws.onmessage = function (evt) {
			var data = evt.data;
			console.log("Message is received...", data);
			var res = JSON.parse(data);
			if (res.status == 0) {
				if (res.result) {
					if (res.result.final) {
						$('.search-phrase').val(res.result.hypotheses[0].transcript);
						$('.search-btn').trigger('click');
					}
				}
			}
		};

		ws.onclose = function (e) {
			var code = e.code;
			var reason = e.reason;
			var wasClean = e.wasClean;
			console.log(e.code + "/" + e.reason + "/" + e.wasClean);
			ws = null;
		};

		ws.onerror = function (e) {
			var data = e.data;
			console.log("Error ", data);
		};

		window.onbeforeunload = function (event) {
			socket.close();
		};
	} else {
		console.log("WebSocket NOT supported by your Browser!");
	}
}

$(document).on("click", "#start-rec-btn", function (e) {
	$('#start-rec-btn').prop('hidden', 'hidden');
	$('#stop-rec-btn').prop('hidden', null);
	$('.search-btn').prop('disabled', true);
	startRecording();
});

$(document).on("click", "#stop-rec-btn", function (e) {
	$('#stop-rec-btn').prop('hidden', 'hidden');
	$('#start-rec-btn').prop('hidden', null);
	$('.search-btn').prop('disabled', false);
	stopRecording(function (audioBlob) {
		sendToWebSocket(audioBlob);
	});
});

$(document).on("click", "#clear-search-btn", function (e) {
	window.location = currentPage;
});

$(document).on("keyup", "input[name='searchWord']", function (e) {
	if ($(this).val()) {
		$("#clear-search-btn").show();
	} else {
		$("#clear-search-btn").hide(1000); //hack to avoid disabling the button
	}
});

$(document).on("click", "a[id^='destin-lang-']", function (e) {
	var destinLangAll = "dlall";
	var destinLang = $(this).attr("data-filter-code");
	if (destinLang == destinLangAll) {
		$("a[id^='destin-lang-']").removeClass("active");
		$(this).addClass("active");
	} else {
		if ($(this).hasClass("active")) {
			$(this).removeClass("active");
			if ($("a[id^='destin-lang-']").hasClass("active") == false) {
				$("a[id^='destin-lang-" + destinLangAll + "']").addClass("active");
			}
		} else {
			$("a[id^='destin-lang-" + destinLangAll + "']").removeClass("active");
			$(this).addClass("active");
		}
	}
	var destinLangsStr = $("a[id^='destin-lang-'].active").map(function (idx, element) {
		return $(element).attr("data-filter-code");
	}).get();
	var selectedLangs = $("a[id^='destin-lang-'].active").map(function (idx, element) {
		return $(element).text();
	}).get();
	$("input[name='destinLangsStr']").val(destinLangsStr);
	$("#selected-langs").text(selectedLangs);
	setSelectedWordHomonymNr();
	clickSearchIfInputExists();
});

$(document).on("click", "a[id^='dataset-']", function (e) {
	var datasetCodeAll = "dsall";
	var datasetCode = $(this).attr("data-filter-code");
	if (datasetCode == datasetCodeAll) {
		$("a[id^='dataset-']").removeClass("active");
		$(this).addClass("active");
	} else {
		if ($(this).hasClass("active")) {
			$(this).removeClass("active");
			if ($("a[id^='dataset-']").hasClass("active") == false) {
				$("a[id^='dataset-" + datasetCodeAll + "']").addClass("active");
			}
		} else {
			$("a[id^='dataset-" + datasetCodeAll + "']").removeClass("active");
			$(this).addClass("active");
		}
	}
	var datasetCodesStr = $("a[id^='dataset-'].active").map(function (idx, element) {
		return $(element).attr("data-filter-code");
	}).get();
	var selectedDatasetsStr = $("a[id^='dataset-'].active").text();
	var selectedDatasetCount = $("a[id^='dataset-'].active").length;
	if (selectedDatasetCount > 1) {
		selectedDatasetsStr = selectedDatasetCount;
	}
	$("input[name='datasetCodesStr']").val(datasetCodesStr);
	$("#selected-datasets").text(selectedDatasetsStr);
	setSelectedWordHomonymNr();
	clickSearchIfInputExists();
});

function setSelectedWordHomonymNr() {
	var selectedHomonymNr = $("#selected-word-homonym-nr").val();
	$("input[name='selectedWordHomonymNr']").val(selectedHomonymNr);
}

function clickSearchIfInputExists() {
	var tempSearchWord = $("input[name='searchWord']").val();
	if (tempSearchWord) {
		$("#search-btn").click();
	}
}
function getSelectedHomonym() {
	var selectedHomonymItem = $(".homonym-item").filter(function () {
		var isHomonymSelected = $(this).closest("form").find("input[name='word-selected']").val();
		return isHomonymSelected == "true";
	}).filter(":first");
	if (selectedHomonymItem.get().length == 0) {
		selectedHomonymItem = $(".homonym-item:first");
	}
	return selectedHomonymItem;
}
function setSelectedHomonymValueForMobile(inputHTML){
	var isMultiHomonym = $(".homonym-item").length > 1;
	if (isMultiHomonym) {
		$("#homonymListToggleButton").html(inputHTML);
	}
}

$(document).on("click","#homonymListToggleButton",function () {
	$(".homonym-list").toggleClass("expand");
});
