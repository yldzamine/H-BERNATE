package com.amine.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.amine.Personel;

public class Personeltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Personel personel = new Personel();
       personel.setPersonelId(1);
       personel.setPersoneladi("Amine");
       personel.setPersonelsoyadi("YILDIZ");
       personel.setPersonelgiristarihi(new Date());
       personel.setPersonleadres("ÝSTANBUL/SArýyer");
       
       
       SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
       Session session = sessionfactory.openSession();
       session.beginTransaction();
       session.save(personel);
       session.getTransaction().commit();
	}

}
