package com.objis.mapping;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.objis.mapping.entities.*;

public class DemoMapping {

	public static void main(String[] args) {
		// Ouverture d'une unite de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demomapping-pu");
		EntityManager em = emf.createEntityManager();
		
		// Ouverture d'une transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		// Instanciation objet metier
		Lieu lieu = new Lieu("Objis","57 rue d'Amsterdam, 75008 Paris");
		Formation formation = new Formation("JPA",new Date(),3,lieu);
		
		// Persistence objet/relationnel: création d'un enregistrement en BD  
		em.persist(formation);
		
		// Recupération formation et lieu
		//Formation form = em.getReference(formation.getClass(), 1L);
		Formation form = em.find(formation.getClass(),1L);
		Lieu zone = form.getLieu();
		
		// Affichage du résultat
		System.out.println("La formation "+form.getTheme()+" va se dérouler "
				+ "à "+zone.getNom()+", "+zone.getAdresse());
		
		// Fermeture de la transaction
		tx.commit();
				
		// Fermeture de l'unite de travail
		em.close();
		emf.close();
	}
}
