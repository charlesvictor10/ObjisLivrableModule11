package com.objis.mappingcollection.entities;

import javax.persistence.*;

@Entity
public class Formateur {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String prenom;
	private String nom;
	private int anneeExperience;
	
	// Constructeurs
	public Formateur() {
		// TODO Auto-generated constructor stub
	}

	public Formateur(String prenom, String nom, int anneeExperience) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.anneeExperience = anneeExperience;
	}

	// Generation des getters et setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnneeExperience() {
		return anneeExperience;
	}

	public void setAnneeExperience(int anneeExperience) {
		this.anneeExperience = anneeExperience;
	}
}
