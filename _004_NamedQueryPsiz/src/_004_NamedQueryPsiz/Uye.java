package _004_NamedQueryPsiz;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the uye database table.
 * 
 */
@Entity
@NamedQuery(name="Uye.findAll", query="SELECT u FROM Uye u")
public class Uye implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int iduye;

	private String uyeadi;

	private String uyemail;

	private String uyesoyadi;

	public Uye() {
	}

	public int getIduye() {
		return this.iduye;
	}

	public void setIduye(int iduye) {
		this.iduye = iduye;
	}

	public String getUyeadi() {
		return this.uyeadi;
	}

	public void setUyeadi(String uyeadi) {
		this.uyeadi = uyeadi;
	}

	public String getUyemail() {
		return this.uyemail;
	}

	public void setUyemail(String uyemail) {
		this.uyemail = uyemail;
	}

	public String getUyesoyadi() {
		return this.uyesoyadi;
	}

	public void setUyesoyadi(String uyesoyadi) {
		this.uyesoyadi = uyesoyadi;
	}

}