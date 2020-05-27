package com.amine.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.amine.Adres;
import com.amine.Personel;

public class Personeltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Personel personel = new Personel();
       personel.setPersoneladi("Kübra");
       personel.setPersonelsoyadi("YILDIZ");
       personel.setPersonelgiristarihi(new Date());
       
       Adres  evAdres= new Adres();
       evAdres.setSehir("ÝSTANBUL");
       evAdres.setSemt("SARIYER");
       evAdres.setMahalle("BEBEK");
       evAdres.setPostakodu("56000");
       
       personel.setEvAdres(evAdres);
       
       SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
       Session session = sessionfactory.openSession();
       session.beginTransaction();
       session.save(personel);
       session.getTransaction().commit();
       session.close();
       
       personel = null;
       session = sessionfactory.openSession();
       session.beginTransaction();
       personel = session.get(Personel.class, 1);
       System.out.println("\nID :"+personel.getPersonelId()+ "\nADI :"+personel.getPersoneladi()+"\nSOYADI :"+personel.getPersonelsoyadi()+"\nGÝRÝÞ TARÝHÝ :"+personel.getPersonelgiristarihi());
       System.out.println("\nADRES :"+personel.getEvAdres().getSehir());
       System.out.println("\nADRES :"+personel.getEvAdres().getSemt());
       System.out.println("\nADRES :"+personel.getEvAdres().getMahalle());
       System.out.println("\nADRES :"+personel.getEvAdres().getPostakodu());
     
       session.close();
	}
	

}
