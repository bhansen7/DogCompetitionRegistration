package edu.dmacc.spring.dogcompetitionregistration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EntryDao {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DogCompetitionRegistration");
	public void insertEntry(Entry entryToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(entryToAdd);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Entry> getAllEntries(){
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select u from Entry u";
		TypedQuery<Entry> typedQuery = em.createQuery(q,Entry.class);
		List<Entry> all = typedQuery.getResultList();
		return all;
		
	}
}
