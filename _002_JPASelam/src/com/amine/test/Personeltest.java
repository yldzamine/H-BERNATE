/*
 * package com.amine.test;
 * 
 * import javax.persistence.EntityManager; import
 * javax.persistence.EntityManagerFactory; import
 * javax.persistence.EntityTransaction; import javax.persistence.Persistence;
 * 
 * import com.amine.Personel;
 * 
 * public class Personeltest {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * EntityManagerFactory emf; EntityManager em;
 * 
 * Personel personel = new Personel(); personel.setPsoyadi("Amine");
 * personel.setPersonelsoyadi("Yýldýz");
 * 
 * emf = Persistence.createEntityManagerFactory("_002_JPASelam"); em =
 * emf.createEntityManager();
 * 
 * EntityTransaction et = em.getTransaction();
 * 
 * et.begin(); em.persist(personel); et.commit(); System.out.println("\nID :" +
 * personel.getPersonelId() + "\nADI :" +personel.getPsoyadi() + "\nSOYADÝ : "+
 * personel.getPersonelsoyadi()); em.close(); emf.close();
 * 
 * }
 * 
 * }
 */