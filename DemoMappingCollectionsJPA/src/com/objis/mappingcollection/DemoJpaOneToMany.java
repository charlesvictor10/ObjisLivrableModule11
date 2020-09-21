package com.objis.mappingcollection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.objis.mappingcollection.entities.Formateur;
import com.objis.mappingcollection.entities.Formation;

public class DemoJpaOneToMany {

	public static void main(String[] args) {
		// Ouverture d'une unite de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
				
		// Ouverture d'une transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
				
		// Instanciation objet metier
		Formation formation = new Formation("Hibernate");
		Formateur formateur = new Formateur("Douglas", "Mbiandou", 12);
		Formateur formateur2 = new Formateur("Olivier", "Bronzini", 10);
		
		formation.getFormateurs().add(formateur);
		formation.getFormateurs().add(formateur2);
				
		// Persistence objet/relationnel: création d'un enregistrement en BD  
		em.persist(formation);
		em.persist(formateur);
		em.persist(formateur2);
						
		// Fermeture de la transaction
		tx.commit();
						
		// Fermeture de l'unite de travail
		em.close();
		emf.close();
	}
}
