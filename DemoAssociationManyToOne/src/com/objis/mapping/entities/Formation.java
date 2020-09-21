package com.objis.mapping.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Formation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String theme;
	private Date dateDebut;
	private int duree;
	// Relation unidirectionnelle entre formation et lieu
	@ManyToOne(cascade=CascadeType.ALL)
	private Lieu lieu;

	// Constructeurs
	public Formation() {
		// TODO Auto-generated constructor stub
	}

	public Formation(String theme, Date dateDebut, int duree) {
		super();
		this.theme = theme;
		this.dateDebut = dateDebut;
		this.duree = duree;
	}
	
	public Formation(String theme, Date dateDebut, int duree, Lieu lieu) {
		super();
		this.theme = theme;
		this.dateDebut = dateDebut;
		this.duree = duree;
		this.lieu = lieu;
	}

	// Génération des getters et setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}
}
