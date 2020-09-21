package com.objis.mappingheritage.entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_FORMATION")
@DiscriminatorValue("MERE")
/*
 * @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
 * 
 * @Inheritance(strategy=InheritanceType.JOINED)
 */
public class Formation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/* @GeneratedValue(strategy=GenerationType.TABLE) */
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
