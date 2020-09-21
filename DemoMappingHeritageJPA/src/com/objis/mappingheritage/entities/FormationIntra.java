package com.objis.mappingheritage.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("INTRA")
public class FormationIntra extends Formation {
	private String niveauPersonnalisationSupports;

	// Constructeurs
	public FormationIntra() {
		// TODO Auto-generated constructor stub
	}

	public FormationIntra(String niveauPersonnalisationSupports) {
		super();
		this.niveauPersonnalisationSupports = niveauPersonnalisationSupports;
	}
	
	// Generation des getters et setters
	public String getNiveauPersonnalisationSupports() {
		return niveauPersonnalisationSupports;
	}

	public void setNiveauPersonnalisationSupports(String niveauPersonnalisationSupports) {
		this.niveauPersonnalisationSupports = niveauPersonnalisationSupports;
	}
}
