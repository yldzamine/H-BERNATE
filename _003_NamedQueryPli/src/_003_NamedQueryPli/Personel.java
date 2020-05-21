package _003_NamedQueryPli;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the personel database table.
 * 
 */
@Entity
@NamedQuery(name="Personel.findAll", query="SELECT p FROM Personel p")
public class Personel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pId;

	private String padi;

	private String personeladi;

	private int personelId;

	private String personelsoyadi;

	private String psoyadi;

	public Personel() {
	}

	public int getPId() {
		return this.pId;
	}

	public void setPId(int pId) {
		this.pId = pId;
	}

	public String getPadi() {
		return this.padi;
	}

	public void setPadi(String padi) {
		this.padi = padi;
	}

	public String getPersoneladi() {
		return this.personeladi;
	}

	public void setPersoneladi(String personeladi) {
		this.personeladi = personeladi;
	}

	public int getPersonelId() {
		return this.personelId;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}

	public String getPersonelsoyadi() {
		return this.personelsoyadi;
	}

	public void setPersonelsoyadi(String personelsoyadi) {
		this.personelsoyadi = personelsoyadi;
	}

	public String getPsoyadi() {
		return this.psoyadi;
	}

	public void setPsoyadi(String psoyadi) {
		this.psoyadi = psoyadi;
	}

}