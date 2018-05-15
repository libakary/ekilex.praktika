var windowWidthTreshold = 769;

$(document).ready(function() {

	initLanguageFilter();
	initialiseRecording(speechRecognitionServiceUrl);

	var isWideWindow = $(window).width() > windowWidthTreshold;
	var isSingleHomonym = $(".homonym-item").length == 1;
	if (isWideWindow || isSingleHomonym) {
		var selectedHomonymItem = $(".homonym-item").filter(function() {
			var isHomonymSelected = $(this).closest("form").find("input[name='word-selected']").val();
			return isHomonymSelected == "true";
		}).filter(":first");
		if (selectedHomonymItem.get().length == 0) {
			selectedHomonymItem = $(".homonym-item:first");
		}
		selectedHomonymItem.delay(1250).queue(function() {}).trigger('click');
		selectedHomonymItem.addClass("animation-target");
	}
	calculateAndSetStyles();

	var searchWordAutocompleteMenuRenderer = function(ul, items) {
		var self = this;
        var groups = [];

        groups = $.map(items, function(item) {
        	return item.group;
        });

        groups = $.grep(groups, function(el, index) {
            return index === $.inArray(el, groups);
        });

        ul.addClass("list-group");
        $.each(groups, function (index, group) {
        	if (group == "form") {
        		var li = $("<li>");
        		li.addClass("list-group-item list-group-item-info");
        		//TODO add localised message
        		li.text("see on ka vorm sõnadest");
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
		source: function(request, response) {
			var sourceLang = $("button[name='source-lang-btn'].active").val();
			var destinLang = $("button[name='destin-lang-btn'].active").val();
			var wordPrefix = request.term;
			var searchWordsByPrefixUrlWithParams = searchWordsByPrefixUrl + "/" + sourceLang + "/" + destinLang + "/" + wordPrefix;
			$.ajax({
				url: searchWordsByPrefixUrlWithParams,
				type: "GET",
				success: function(data) {
					var words = data.words;
					var forms = data.forms;
					var fullList = [];
					$.each(data.words, function(index, item) {
						fullList.push({group : "word", label : item, value : item});
					});
					$.each(data.forms, function(index, item) {
						fullList.push({group : "form", label : item, value : item});
					});
					response(fullList);
				}
			});
		},
		minLength: 2,
		create: function() {
			$(this).data('uiAutocomplete')._renderMenu = searchWordAutocompleteMenuRenderer;
		},
		select: function(event, ui) {
			if (ui.item) {
				$("input[name='searchWord']").val(ui.item.value);
				$("#search-btn").click();
			}
			return false;
		},
		open: function() {
			return false;
		},
		close: function() {
			return false;
		}
	};

	$("input[name='searchWord']").autocomplete(searchWordAutocompleteConfig).autocomplete("instance");

	$('[data-toggle="tooltip"]').tooltip();
});

$(window).resize(function() {
	calculateAndSetStyles();
});

function initLanguageFilter() {
	$("button[name = 'source-lang-btn'][value = '" + sourceLang + "']").addClass("active");
	$("button[name = 'destin-lang-btn'][value = '" + destinLang + "']").addClass("active");
	empowerLanguageSelection();
}

function clearLanguageSelection(name) {
	$("button[name = '" + name + "']").each(function() {
		$(this).removeClass("active");
	});
}

function empowerLanguageSelection() {
	var sourceLangLabel = $("button[name = 'source-lang-btn'].active").text();
	var destinLangLabel = $("button[name = 'destin-lang-btn'].active").text();
	$("#source-lang-lbl").text(sourceLangLabel);
	$("#destin-lang-lbl").text(destinLangLabel);
	sourceLang = $("button[name = 'source-lang-btn'].active").val();
	destinLang = $("button[name = 'destin-lang-btn'].active").val();
	$("input[name = 'sourceLang']").val(sourceLang);
	$("input[name = 'destinLang']").val(destinLang);
}

function calculateAndSetStyles() {
	var isWideWindow = $(window).width() > windowWidthTreshold;
	var isSingleHomonym = $(".homonym-item").length == 1;
	var isMultiHomonym = $(".homonym-item").length > 1;
	if (isWideWindow) {
		$(".search-panel").removeClass("d-none");
		$(".content-panel").removeClass("d-none");
		if ($(".homonym-item").length == 1) {
			$(".homonym-panel").addClass("d-none");
			// $(".homonym-panel-empty").removeClass("d-none");
		} else {
			$(".homonym-panel").removeClass("d-none");
			// $(".homonym-panel-empty").addClass("d-none");
			if (!$(".homonym-item").hasClass("last-selected")) {
				$(".homonym-item:first").addClass("last-selected");
			}
			$(".last-selected").addClass("selected");
		}
		$('#form-words').css("margin-top", '1.5em');
	} else {
		if (isMultiHomonym) {
			if (!$(".homonym-panel").hasClass("d-none")) {
				$(".content-panel").addClass("d-none");
			}
			// $(".homonym-panel-empty").addClass("d-none");
		}
		if (isSingleHomonym && $(".homonym-panel").hasClass("d-none")) {
			$(".search-panel").addClass("d-none");
			// $(".homonym-panel-empty").removeClass("d-none");
		}
		if ($(".search-panel").hasClass("d-none")) {
			$('#form-words').css("margin-top", '5em');
		} else {
			$('#form-words').css("margin-top", '0');
		}
	}
}

function playSound(soundSource) {
	var music = new Audio(soundSource);
	music.play();
}

function generateVoiceAndPlay(e) {
	var elem = $(e);
	if (elem.data('url-to-sound') != undefined) {
		playSound(elem.data('urlToSound'));
		return;
	}
	var content = elem.html();
	elem.html(content + ' <i class="fa fa-spinner fa-spin"></i>');
	var words = elem.data('words');
	var data = {
		'words': words
	};
	$.post(applicationUrl + 'generate_voice', data).done(function(urlToSound) {
		elem.data('url-to-sound', urlToSound);
		elem.html(content);
		playSound(urlToSound);
	}).fail(function() {
		elem.html(content);
		console.log(data);
		alert("Heli genereerise teenus hetkel ei toimi, proovige palun hiljem uuesti.");
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
		alert('No web audio support in this browser!');
	}
}

function startRecording() {
	// Access the Microphone using the navigator.getUserMedia method to obtain a stream
	navigator.getUserMedia({
		audio: true
	}, function(stream) {
		// Expose the stream to be accessible globally
		audio_stream = stream;
		var input = audio_context.createMediaStreamSource(stream);
		console.log('Media stream succesfully created');

		recorder = new Recorder(input);
		console.log('Recorder initialised');

		// Start recording !
		recorder && recorder.record();
		console.log('Recording...');
	}, function(e) {
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
	if (typeof(callback) == "function") {
		recorder && recorder.exportWAV(function(blob) {
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
		ws.onopen = function() {
			// Web Socket is connected, send data using send()
			ws.send(audioBlob);
			ws.send("EOS");
			console.log("Message is sent...");
		};

		ws.onmessage = function(evt) {
			var data = evt.data;
			console.log("Message is received...", data);
			var res = JSON.parse(data);
			if (res.status == 0) {
				if (res.result) {
					if (res.result.final) {
						console.log(res.result.hypotheses);
						console.log(res.result.hypotheses[0].transcript);
						$('.search-phrase').val(res.result.hypotheses[0].transcript);
						$('.search-btn').trigger('click');
					}
				}
			}
		};

		ws.onclose = function(e) {
			var code = e.code;
			var reason = e.reason;
			var wasClean = e.wasClean;
			console.log(e.code + "/" + e.reason + "/" + e.wasClean);
			ws = null;
		};

		ws.onerror = function(e) {
			var data = e.data;
			console.log("Error ", data);
		};

		window.onbeforeunload = function(event) {
			socket.close();
		};
	} else {
		console.log("WebSocket NOT supported by your Browser!");
	}
}

$(document).on("click", ".menu-btn", function(e) {
	$(".header-container").toggleClass("show-header");
	// $(".header-links").toggleClass("d-none d-md-block");
});

$(document).on("click", "button[name='source-lang-btn']", function(e) {
	var tempSourceLang = $(this).val();
	var tempDestinLang = $("button[name='destin-lang-btn'].active").val();
	clearLanguageSelection('source-lang-btn');
	$(this).addClass("active");
	if ((tempSourceLang == tempDestinLang) && (tempSourceLang == "rus")) {
		clearLanguageSelection('destin-lang-btn');
		$("button[name='destin-lang-btn'][value='est']").addClass("active");
	}
	empowerLanguageSelection();
});

$(document).on("click", "button[name='destin-lang-btn']", function(e) {
	var tempSourceLang = $("button[name='source-lang-btn'].active").val();
	var tempDestinLang = $(this).val();
	clearLanguageSelection('destin-lang-btn');
	$(this).addClass("active");
	if ((tempSourceLang == tempDestinLang) && (tempDestinLang == "rus")) {
		clearLanguageSelection('source-lang-btn');
		$("button[name='source-lang-btn'][value='est']").addClass("active");
	}
	empowerLanguageSelection();
});

$(document).on("click", "button[id='lang-sel-complete-btn']", function(e) {
	$("#lang-selector-btn").click();
	if ($("input[name='searchWord']").val()) {
		$("#search-btn").click();
	}
});

$(document).on("click", "#start-rec-btn", function(e) {
	$('#start-rec-btn').prop('hidden', 'hidden');
	$('#stop-rec-btn').prop('hidden', null);
	$('.search-btn').prop('disabled', true);
	startRecording();
});

$(document).on("click", "#stop-rec-btn", function(e) {
	$('#stop-rec-btn').prop('hidden', 'hidden');
	$('#start-rec-btn').prop('hidden', null);
	$('.search-btn').prop('disabled', false);
	stopRecording(function(audioBlob) {
		sendToWebSocket(audioBlob);
	});
});
