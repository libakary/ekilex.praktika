package eki.ekilex.web.controller;

import eki.ekilex.constant.WebConstant;
import eki.ekilex.data.Feedback;
import eki.ekilex.service.FeedbackService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@ConditionalOnWebApplication
@Controller
@SessionAttributes(WebConstant.SESSION_BEAN)
public class WordwebFeedbackController implements WebConstant {

	private static final Logger logger = LoggerFactory.getLogger(WordwebFeedbackController.class);

	private FeedbackService feedbackService;

	public WordwebFeedbackController(FeedbackService service) {
		this.feedbackService = service;
	}

	@GetMapping(WW_FEEDBACK_URI)
	public String openPage(Model model) {
		List<Feedback> feedback = feedbackService.findFeedback();
		model.addAttribute("feedbackLog", feedback);
		return WW_FEEDBACK_PAGE;
	}

	@CrossOrigin
	@PostMapping(SEND_FEEDBACK_URI)
	@ResponseBody
	public String receiveFeedback(Feedback newFeedback) {

		logger.debug("This is feedback : \"{}\"", newFeedback);

		String statusMessage;
		if (feedbackService.isValidFeedback(newFeedback)) {
			statusMessage = feedbackService.addFeedback(newFeedback);
		} else {
			statusMessage = "error";
		}
		return "{\"status\": \"" + statusMessage + "\"}";
	}

}
