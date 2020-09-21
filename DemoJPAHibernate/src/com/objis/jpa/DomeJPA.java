package com.objis.jpa;

import javax.persistence.*;

import com.objis.jpa.entities.Formation;

public class DomeJPA {

	public static void main(String[] args) {
		// Ouverture d'une unite de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		
		// Ouverture d'une transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		// Instanciation objet metier
		Formation formation = new Formation("Hibernate");
		
		// Persistence objet/relationnel: création d'un enregistrement en BD  
		em.persist(formation);
				
		// Fermeture de la transaction
		tx.commit();
				
		// Fermeture de l'unite de travail
		em.close();
		emf.close();
	}

}
