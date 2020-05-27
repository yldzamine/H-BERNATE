package com.amine;

import javax.persistence.Embeddable;

@Embeddable
//Baþka bir sýnýf tarafýndan çaðrýlýp bir alan gibi kullanýlacak,gömülecek.
public class Adres {

	private String sehir;
	private String semt;
	private String mahalle;
	private String postakodu;
	
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getSemt() {
		return semt;
	}
	public void setSemt(String semt) {
		this.semt = semt;
	}
	public String getMahalle() {
		return mahalle;
	}
	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}
	public String getPostakodu() {
		return postakodu;
	}
	public void setPostakodu(String postakodu) {
		this.postakodu = postakodu;
	}
}
