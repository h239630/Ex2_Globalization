package no.hvl.dat152.JavaApp;

public class Product {
	
	private int pno;
	private String pName;
	private String priceInEuro;
	private String imageFile;
	
	public Product(int pno, String pName, String priceInEuro, String imageFile) {
		super();
		this.pno = pno;
		this.pName = pName;
		this.priceInEuro = priceInEuro;
		this.imageFile = imageFile;
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
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}

	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}

	/**
	 * @return the priceInEuro
	 */
	public String getPriceInEuro() {
		return priceInEuro;
	}

	/**
	 * @param priceInEuro the priceInEuro to set
	 */
	public void setPriceInEuro(String priceInEuro) {
		this.priceInEuro = priceInEuro;
	}

	/**
	 * @return the imageFile
	 */
	public String getImageFile() {
		return imageFile;
	}

	/**
	 * @param imageFile the imageFile to set
	 */
	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
	
	

}
