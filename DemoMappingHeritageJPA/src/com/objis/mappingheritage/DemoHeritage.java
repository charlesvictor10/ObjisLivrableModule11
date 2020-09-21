package com.objis.mappingheritage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.objis.mappingheritage.entities.Formation;
import com.objis.mappingheritage.entities.FormationInter;
import com.objis.mappingheritage.entities.FormationIntra;

public class DemoHeritage {

	public static void main(String[] args) {
		// Ouverture d'une unite de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
						
		// Ouverture d'une transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
						
		// Instanciation objet metier
		Formation formationIntra = new FormationIntra("niveau Personnalisation 2");
		Formation formationInter = new FormationInter(8);
		Formation formation = new Formation("JAVA EE");
						
		// Persistence objet/relationnel: création d'un enregistrement en BD  
		em.persist(formationIntra);
		em.persist(formationInter);
		em.persist(formation);
								
		// Fermeture de la transaction
		tx.commit();
								
		// Fermeture de l'unite de travail
		em.close();
		emf.close();
	}
}
