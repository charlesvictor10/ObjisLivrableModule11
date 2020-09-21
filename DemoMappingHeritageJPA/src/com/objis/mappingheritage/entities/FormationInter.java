package com.objis.mappingheritage.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("INTER")
public class FormationInter extends Formation {
	private int nbEntreprises;

	// Constructeurs
	public FormationInter() {
		// TODO Auto-generated constructor stub
	}

	public FormationInter(int nbEntreprises) {
		super();
		this.nbEntreprises = nbEntreprises;
	}

	// Generation des getters et setters
	public int getNbEntreprises() {
		return nbEntreprises;
	}

	public void setNbEntreprises(int nbEntreprises) {
		this.nbEntreprises = nbEntreprises;
	}
}
