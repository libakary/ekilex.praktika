package eki.eve.data;

import eki.common.data.AbstractDataObject;

import javax.persistence.Column;
import java.util.function.Consumer;

public class Definition extends AbstractDataObject {

	private static final long serialVersionUID = 1L;

	@Column(name = "value")
	private String value;

	@Column(name = "lang")
	private String lang;

	public Definition() {
	}

	public Definition(Consumer<Definition> builder) {
		builder.accept(this);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
}
