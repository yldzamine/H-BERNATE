package com.amine;

import javax.persistence.Embeddable;

@Embeddable
//Ba�ka bir s�n�f taraf�ndan �a�r�l�p bir alan gibi kullan�lacak,g�m�lecek.
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
