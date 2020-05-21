package _003_NameQueryPli.Test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import _003_NamedQueryPli.Musteri;



public class Musteritest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  EntityManagerFactory emf;
	  EntityManager em;
	  
	  Musteri musteri = new Musteri();
	  musteri.setIdmusteri(8);
	  musteri.setMusteriadi("Nazlý");
	  musteri.setMusterisoyadi("YILDIZ");
	  
	  emf = Persistence.createEntityManagerFactory("_003_NamedQueryPli");
	  em  = emf.createEntityManager();
	  
	  EntityTransaction et = em.getTransaction();
	  
	  et.begin();
	      em.persist(musteri);
      et.commit();
      
      int gelendeger = 5;
      Query query = em.createNamedQuery("isimlerigetir").setParameter("p_Id",gelendeger);
      List<?> list = query.getResultList();
      
      for (Object obj : list) {
    	  musteri = (Musteri) obj;
      
      System.out.println("\nID" +musteri.getIdmusteri()+" "+musteri.getMusteriadi()+""+musteri.getMusterisoyadi());
      em.close();
      emf.close();
      }
      
	}

}
