package com.objis.mapping.entities;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class Lieu {
	@Id
	private Long id;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String nom;
	private String adresse;
	/*
	 * Pour rendre la relation bidirectionnelle 
	 * Collection de formations
	 * EAGER on effectue la r�cup�ration des �l�ments 
	 * de la collection, d�s que l�on r�cup�re l�objet 
	 * et donc on initialise la collection
	 * LAZY on n�effectue la r�cup�ration des �l�ments 
	 * de la collection que � la demande, 
	 * c�est � dire d�s que l�on aura besoin de la collection
	 */
	@OneToMany(mappedBy="lieu", fetch=FetchType.EAGER)
	private Collection<Formation> formations;

	// Constructeurs
	public Lieu() {
		// TODO Auto-generated constructor stub
	}

	public Lieu(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}
	
	// G�n�ration des getters et setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Collection<Formation> getFormations() {
		return formations;
	}

	public void setFormations(Collection<Formation> formations) {
		this.formations = formations;
	}	
}
