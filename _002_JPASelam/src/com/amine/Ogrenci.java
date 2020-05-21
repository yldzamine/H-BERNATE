package com.amine;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.AUTO;


/**
 * The persistent class for the ogrenci database table.
 * 
 */
@Entity
@NamedQuery(name="Ogrenci.findAll", query="SELECT o FROM Ogrenci o")
public class Ogrenci implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = AUTO)
	private int ogrId;

	private String ogradi;

	private String ogrbolum;

	private String ogrno;

	private String ogrsoyadi;

	public Ogrenci() {
	}

	public int getOgrId() {
		return this.ogrId;
	}

	public void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	}

	public String getOgradi() {
		return this.ogradi;
	}

	public void setOgradi(String ogradi) {
		this.ogradi = ogradi;
	}

	public String getOgrbolum() {
		return this.ogrbolum;
	}

	public void setOgrbolum(String ogrbolum) {
		this.ogrbolum = ogrbolum;
	}

	public String getOgrno() {
		return this.ogrno;
	}

	public void setOgrno(String ogrno) {
		this.ogrno = ogrno;
	}

	public String getOgrsoyadi() {
		return this.ogrsoyadi;
	}

	public void setOgrsoyadi(String ogrsoyadi) {
		this.ogrsoyadi = ogrsoyadi;
	}

}