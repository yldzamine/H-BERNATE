package com.amine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //veritaban�nda bir varl�k s�n�f�
public class Personel implements Serializable{

	@Column(name="ID")
	private int personelId;
	@Column(name="AD�")
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
