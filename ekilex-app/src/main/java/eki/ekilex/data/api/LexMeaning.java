package eki.ekilex.data.api;

import java.util.List;

import eki.common.data.AbstractDataObject;

public class LexMeaning extends AbstractDataObject {

	private static final long serialVersionUID = 1L;

	private Long lexemeId;

	private Long meaningId;

	private List<Definition> definitions;

	private List<Freeform> usages;

	public Long getLexemeId() {
		return lexemeId;
	}

	public void setLexemeId(Long lexemeId) {
		this.lexemeId = lexemeId;
	}

	public Long getMeaningId() {
		return meaningId;
	}

	public void setMeaningId(Long meaningId) {
		this.meaningId = meaningId;
	}

	public List<Definition> getDefinitions() {
		return definitions;
	}

	public void setDefinitions(List<Definition> definitions) {
		this.definitions = definitions;
	}

	public List<Freeform> getUsages() {
		return usages;
	}

	public void setUsages(List<Freeform> usages) {
		this.usages = usages;
	}
}
