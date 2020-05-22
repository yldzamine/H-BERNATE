package com.amine;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
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
@Table(name="CAL�SANLAR")//Veritaban� tablo ad�.
@SecondaryTable(name="ikincitablo")
public class Personel {

	@Column(name="ID") //Veritaban�ndaki tablodaki bir kolon ad�.
	//@TableGenerator(name="ektablo", table="tblpersonel", pkColumnValue="60000", pkColumnName ="maasi", allocationSize =1)
	//ek tablo olu�turmaya yarar Id de�erini saklar.
	@GeneratedValue(strategy = GenerationType.TABLE,generator = "ektablo") // Id de�eri otomatik art�cakt�r.
	private int personelId;
	@Column(name="ADI")
	@Basic // bu alan veritaban�nda mutlakabulunacak.
	private String personeladi;
	
	@Column(table = "ikincitablo")
	private String personelsoyadi;
	
	@Column(name="ADRES",table = "ikincitablo")
	private Date personelgiristarihi;
	
	
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
