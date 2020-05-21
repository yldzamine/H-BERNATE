package com.amine.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.amine.Musteri;

public class Musteritest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  EntityManagerFactory emf;
	  EntityManager em;
	  
	  Musteri musteri = new Musteri();
	  musteri.setIdmusteri(3);
	  musteri.setMusteriadi("Nazlý");
	  musteri.setMusterisoyadi("YILDIZ");
	  
	  emf = Persistence.createEntityManagerFactory("_002_JPASelam");
	  em  = emf.createEntityManager();
	  
	  EntityTransaction et = em.getTransaction();
	  
	  et.begin();
	      em.persist(musteri);
      et.commit();
      
      System.out.println("\nID" +musteri.getIdmusteri()+" "+musteri.getMusteriadi()+""+musteri.getMusterisoyadi());
      em.close();
      emf.close();
      
	}

}
