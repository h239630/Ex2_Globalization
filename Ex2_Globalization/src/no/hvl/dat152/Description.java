package no.hvl.dat152;

public class Description {
	
	private int pno;
	private String langCode;
	private String text;
	
	public Description(int pno, String langCode, String text) {
		super();
		this.pno = pno;
		this.langCode = langCode;
		this.text = text;
	}

	/**
	 * @return the pno
	 */
	public int getPno() {
		return pno;
	}

	/**
	 * @param pno the pno to set
	 */
	public void setPno(int pno) {
		this.pno = pno;
	}

	/**
	 * @return the langCode
	 */
	public String getLangCode() {
		return langCode;
	}

	/**
	 * @param langCode the langCode to set
	 */
	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Description [pno=" + pno + ", langCode=" + langCode + ", text=" + text + "]";
	} 
	
	

}
