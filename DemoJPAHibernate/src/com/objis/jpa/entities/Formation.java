package com.objis.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String theme;
	
	// Constructeurs
	public Formation() {
		// TODO Auto-generated constructor stub
	}

	public Formation(String theme) {
		super();
		this.theme = theme;
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
}
