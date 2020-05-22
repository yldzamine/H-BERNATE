package com.amine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "PERSONEL_TABLOSU") //Veritabaný tablo adý.
public class Personel {

	@Column(name="ID") //Veritabanýndaki tablodaki bir kolon adý.
	private int personelId;
	@Column(name="ADI")
	private String personeladi;
	@Column(name="SOYADI")
	private String personelsoyadi;
	
	@Id
	public int getPersonelId() {
		return personelId;
	}
	
	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}

	public String getPersoneladi() {
		return personeladi;
	}
	public void setPersoneladi(String personeladi) {
		this.personeladi = personeladi;
	}
	public String getPersonelsoyadi() {
		return personelsoyadi;
	}
	public void setPersonelsoyadi(String personelsoyadi) {
		this.personelsoyadi = personelsoyadi;
	}
	
}
