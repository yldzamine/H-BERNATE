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
       
       Adres adres1= new Adres();
       adres1.setSehir("ÝSTANBUL");
       adres1.setSemt("SARIYER");
       adres1.setMahalle("BEBEK");
       adres1.setPostakodu("56000");
       
       personel.getAdresListesi().add(adres1);
       
       Adres adres2= new Adres();
       adres2.setSehir("ÝSTANBUL");
       adres2.setSemt("BEÞÝKTAÞ");
       adres2.setMahalle("BEBEK");
       adres2.setPostakodu("61600");
       personel.getAdresListesi().add(adres2);
             
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
       session.close();
	}
	

}
