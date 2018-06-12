package com.r;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Gestionone {
	Configuration config = new Configuration();
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	AnimalOMU animal;
	TerritoryU territory;
	
	
	public Gestionone() {
	}
	
	public void addTerritory(TerritoryU territory) {
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(territory);
		session.getTransaction().commit();
		session.close();
	}
}
