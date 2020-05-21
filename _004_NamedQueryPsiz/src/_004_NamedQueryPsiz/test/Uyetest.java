package _004_NamedQueryPsiz.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import _004_NamedQueryPsiz.Uye;

public class Uyetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 EntityManagerFactory emf;
		 EntityManager em;
		  
		 Uye uye = new Uye();
		 //uye.setIduye();
		 uye.setUyeadi("Kübra");
		 uye.setUyesoyadi("Yýldýz");
		 uye.setUyemail("kibray@gmail.com");
		 
		 emf = Persistence.createEntityManagerFactory("_004_NamedQueryPsiz");
		  em  = emf.createEntityManager();
		  
		  EntityTransaction et = em.getTransaction();
		  
		  et.begin();
		      em.persist(uye);
	      et.commit();
	      
	      Query query = em.createNamedQuery("Uye.findAll");
	      List<?> list = query.getResultList();
	      
	      for (Object obj : list) {
	    	  uye =  (Uye) obj;
	      
	      System.out.println("\nID :" +uye.getIduye()+"\nADI :"+uye.getUyeadi()+"\nSOYADI :"+uye.getUyesoyadi()+"\nEMAÝL : "+uye.getUyemail());
	     
	      }
	      em.close();
	      emf.close();
	      
		}
		 
		
}


