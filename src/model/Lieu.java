package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lieu {

	@Id
	@GeneratedValue
	private int idLieu;
	private String Adresse;
	private String Ville;
	
	public Lieu(int idLieu, String adresse, String ville) {
		super();
		this.idLieu = idLieu;
		Adresse = adresse;
		Ville = ville;
	}

	public Lieu() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Lieu [idLieu=" + idLieu + ", Adresse=" + Adresse + ", Ville=" + Ville + "]";
	}

	public int getIdLieu() {
		return idLieu;
	}

	public void setIdLieu(int idLieu) {
		this.idLieu = idLieu;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}
	
	
}
