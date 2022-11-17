package eki.wordweb.data.type;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import eki.common.constant.Complexity;
import eki.common.data.AbstractDataObject;
import eki.wordweb.data.ComplexityType;
import eki.wordweb.data.SourceLinkType;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TypeMediaFile extends AbstractDataObject implements ComplexityType, SourceLinkType {

	private static final long serialVersionUID = 1L;

	private Long freeformId;

	private String sourceUrl;

	private String title;

	private Complexity complexity;

	private List<TypeSourceLink> sourceLinks;

	@Override
	public Long getOwnerId() {
		return freeformId;
	}

	public Long getFreeformId() {
		return freeformId;
	}

	public void setFreeformId(Long freeformId) {
		this.freeformId = freeformId;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public Complexity getComplexity() {
		return complexity;
	}

	public void setComplexity(Complexity complexity) {
		this.complexity = complexity;
	}

	@Override
	public List<TypeSourceLink> getSourceLinks() {
		return sourceLinks;
	}

	@Override
	public void setSourceLinks(List<TypeSourceLink> sourceLinks) {
		this.sourceLinks = sourceLinks;
	}

}
