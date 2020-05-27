package com.amine;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
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
@Table(name="personel_tablosu")//Veritabaný tablo adý.
public class Personel implements Serializable{

	@Column(name="ID") //Veritabanýndaki tablodaki bir kolon adý.
	@GeneratedValue(strategy = GenerationType.AUTO) // Id deðeri otomatik artýcaktýr.
	private int personelId;

	private String personeladi;

	private String personelsoyadi;
	
	private Date personelgiristarihi;
	
	@Embedded //Bu alana gömülü olan baþka bir sýnýftan bilgiler getirilecek. 
	@ElementCollection //Çocuk tablolarý da gelecek.
	private Set<Adres> adresListesi= new HashSet<>();

	
	public Set<Adres> getAdresListesi() {
		return adresListesi;
	}

	public void setAdresListesi(Set<Adres> adresListesi) {
		this.adresListesi = adresListesi;
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
