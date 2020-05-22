package com.amine;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="CALÝSANLAR")//Veritabaný tablo adý.
public class Personel {

	@Column(name="ID") //Veritabanýndaki tablodaki bir kolon adý.
	private int personelId;
	@Column(name="ADI")
	@Basic // bu alan veritabanýnda mutlakabulunacak.
	private String personeladi;
	
	@Transient
	private String personelsoyadi;
	
	@Column(name="GÝRÝS_TARÝHÝ")
	private Date personelgiristarihi;
	@Column(name="ADRES")
	public Date getPersonelgiristarihi() {
		return personelgiristarihi;
	}

	public void setPersonelgiristarihi(Date personelgiristarihi) {
		this.personelgiristarihi = personelgiristarihi;
	}

	public String getPersonleadres() {
		return personleadres;
	}

	public void setPersonleadres(String personleadres) {
		this.personleadres = personleadres;
	}
	private String personleadres;
	
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
