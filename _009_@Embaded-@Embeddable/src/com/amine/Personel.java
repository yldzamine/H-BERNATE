package com.amine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="ADRES_B�LG�LER�")//Veritaban� tablo ad�.
public class Personel implements Serializable{

	@Column(name="ID") //Veritaban�ndaki tablodaki bir kolon ad�.
	@GeneratedValue(strategy = GenerationType.AUTO) // Id de�eri otomatik art�cakt�r.
	private int personelId;

	private String personeladi;

	private String personelsoyadi;
	
	private Date personelgiristarihi;
	
	@Embedded //Bu alana g�m�l� olan ba�ka bir s�n�ftan bilgiler getirilecek. 
	@AttributeOverrides({
	@AttributeOverride(name = "sehir",column =@Column(name="evicin_sehiradi" )),
	@AttributeOverride(name = "semt",column =@Column(name="evicin_semt" )),
	@AttributeOverride(name = "mahalle",column =@Column(name="evicin_mahalle" )),
	@AttributeOverride(name = "postakodu",column =@Column(name="evicin_postakodu" )) })
	private Adres evAdres;
	
	
	public Adres getEvAdres() {
		return evAdres;
	}

	public void setEvAdres(Adres evAdres) {
		this.evAdres = evAdres;
	}

	
	public Date getPersonelgiristarihi() {
		return personelgiristarihi;
	}

	public void setPersonelgiristarihi(Date personelgiristarihi) {
		this.personelgiristarihi = personelgiristarihi;
	}

		
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
