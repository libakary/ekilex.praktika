package eki.ekilex.data.api;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import eki.common.data.AbstractDataObject;

public class TermMeaning extends AbstractDataObject {

	private static final long serialVersionUID = 1L;

	private Long meaningId;

	private String datasetCode;

	private List<Classifier> domains;

	private List<Definition> definitions;

	private List<Freeform> notes;

	private List<Forum> forums;

	private List<TermWord> words;

	private List<String> conceptIds;

	@JsonFormat(pattern = "dd.MM.yyyy")
	private LocalDate manualEventOn;

	private String manualEventBy;

	@JsonFormat(pattern = "dd.MM.yyyy")
	private LocalDate firstCreateEventOn;

	private String firstCreateEventBy;

	public Long getMeaningId() {
		return meaningId;
	}

	public void setMeaningId(Long meaningId) {
		this.meaningId = meaningId;
	}

	public String getDatasetCode() {
		return datasetCode;
	}

	public void setDatasetCode(String datasetCode) {
		this.datasetCode = datasetCode;
	}

	public List<Classifier> getDomains() {
		return domains;
	}

	public void setDomains(List<Classifier> domains) {
		this.domains = domains;
	}

	public List<Definition> getDefinitions() {
		return definitions;
	}

	public void setDefinitions(List<Definition> definitions) {
		this.definitions = definitions;
	}

	public List<Freeform> getNotes() {
		return notes;
	}

	public void setNotes(List<Freeform> notes) {
		this.notes = notes;
	}

	public List<Forum> getForums() {
		return forums;
	}

	public void setForums(List<Forum> forums) {
		this.forums = forums;
	}

	public List<TermWord> getWords() {
		return words;
	}

	public void setWords(List<TermWord> words) {
		this.words = words;
	}

	public List<String> getConceptIds() {
		return conceptIds;
	}

	public void setConceptIds(List<String> conceptIds) {
		this.conceptIds = conceptIds;
	}

	public LocalDate getManualEventOn() {
		return manualEventOn;
	}

	public void setManualEventOn(LocalDate manualEventOn) {
		this.manualEventOn = manualEventOn;
	}

	public String getManualEventBy() {
		return manualEventBy;
	}

	public void setManualEventBy(String manualEventBy) {
		this.manualEventBy = manualEventBy;
	}

	public LocalDate getFirstCreateEventOn() {
		return firstCreateEventOn;
	}

	public void setFirstCreateEventOn(LocalDate firstCreateEventOn) {
		this.firstCreateEventOn = firstCreateEventOn;
	}

	public String getFirstCreateEventBy() {
		return firstCreateEventBy;
	}

	public void setFirstCreateEventBy(String firstCreateEventBy) {
		this.firstCreateEventBy = firstCreateEventBy;
	}
}
