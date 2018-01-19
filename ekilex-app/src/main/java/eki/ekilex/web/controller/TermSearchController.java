package eki.ekilex.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import eki.ekilex.constant.WebConstant;
import eki.ekilex.data.TermDetails;
import eki.ekilex.data.Word;
import eki.ekilex.service.CommonDataService;
import eki.ekilex.service.LexSearchService;
import eki.ekilex.service.TermSearchService;

@ConditionalOnWebApplication
@Controller
public class TermSearchController implements WebConstant {

	private static final Logger logger = LoggerFactory.getLogger(TermSearchController.class);

	@Autowired
	private CommonDataService commonDataService;

	@Autowired
	private LexSearchService lexSearchService;

	@Autowired
	private TermSearchService termSearchService;

	@GetMapping(TERM_SEARCH_URI)
	public String termSearch(
			@RequestParam(required = false) String searchFilter,
			@RequestParam(name = "dicts", required = false) List<String> selectedDatasets,
			Model model, HttpSession session) {

		logger.debug("Searching by \"{}\" in {}", searchFilter, selectedDatasets);

		Map<String, String> datasetNameMap = commonDataService.getDatasetNameMap();
		if (selectedDatasets == null) {
			if (session.getAttribute("datasets") == null) {
				selectedDatasets = new ArrayList<>(datasetNameMap.keySet());
			} else {
				selectedDatasets = (List<String>) session.getAttribute("datasets");
			}
		}
		session.setAttribute("datasets", selectedDatasets);

		List<Word> words = lexSearchService.findWords(searchFilter, selectedDatasets);

		model.addAttribute("datasets", datasetNameMap.entrySet());
		model.addAttribute("selectedDatasets", selectedDatasets);
		model.addAttribute("wordsFoundBySearch", words);
		model.addAttribute("searchFilter", searchFilter);

		return TERM_SEARCH_PAGE;
	}

	@GetMapping("/termdetails/{wordId}")
	public String details(@PathVariable("wordId") Long wordId, Model model, HttpSession session) {

		logger.debug("Requesting details by form {}", wordId);

		List<String> selectedDatasets = (List<String>) session.getAttribute("datasets");
		if (selectedDatasets == null) {
			Map<String, String> datasets = commonDataService.getDatasetNameMap();
			selectedDatasets = new ArrayList<>(datasets.keySet());
		}
		TermDetails details = termSearchService.getTermDetails(wordId, selectedDatasets);

		model.addAttribute("wordId", wordId);
		model.addAttribute("details", details);

		return TERM_SEARCH_PAGE + " :: details";
	}
}
