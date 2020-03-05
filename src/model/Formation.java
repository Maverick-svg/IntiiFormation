package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Formation {

	@Id
	@GeneratedValue
	private int idFormation;
	private String theme;
	@ManyToOne
	@JoinColumn(name="idLieu")
	private Lieu lieu;
	
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formation(int idFormation, String theme) {
		super();
		this.idFormation = idFormation;
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "Formation [idFormation=" + idFormation + ", theme=" + theme + "]";
	}

	public int getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}
	
	
	
}
