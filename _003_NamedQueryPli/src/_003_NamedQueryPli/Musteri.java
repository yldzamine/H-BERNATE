package _003_NamedQueryPli;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the musteri database table.
 * 
 */
@Entity
@NamedQuery(name="Musteri.findAll", query="SELECT m FROM Musteri m")
public class Musteri implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int idmusteri;

	private String musteriadi;

	private String musterisoyadi;

	public Musteri() {
	}

	public int getIdmusteri() {
		return this.idmusteri;
	}

	public void setIdmusteri(int idmusteri) {
		this.idmusteri = idmusteri;
	}

	public String getMusteriadi() {
		return this.musteriadi;
	}

	public void setMusteriadi(String musteriadi) {
		this.musteriadi = musteriadi;
	}

	public String getMusterisoyadi() {
		return this.musterisoyadi;
	}

	public void setMusterisoyadi(String musterisoyadi) {
		this.musterisoyadi = musterisoyadi;
	}

}