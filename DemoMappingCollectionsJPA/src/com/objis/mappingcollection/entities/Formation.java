package com.objis.mappingcollection.entities;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class Formation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String theme;
	@OneToMany
	private Collection<Formateur> formateurs;

	// Constructeurs
	public Formation() {
		// TODO Auto-generated constructor stub
	}

	public Formation(String theme) {
		super();
		this.theme = theme;
	}

	public Formation(String theme, Collection<Formateur> formateurs) {
		super();
		this.theme = theme;
		this.formateurs = formateurs;
	}

	// Generation des getters et setters
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

	public Collection<Formateur> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(Collection<Formateur> formateurs) {
		this.formateurs = formateurs;
	}
}
