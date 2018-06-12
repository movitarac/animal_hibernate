package com.r;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GestionTBi {
	Configuration config = new Configuration();
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	//Session session = factory.openSession();
	TerritoryBi territory;
	AnimalBi animal;
	
	public GestionTBi() {
	}

	public void addAnimal(AnimalBi animal) {
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(animal);
		session.getTransaction().commit();
		session.close();
	}

	public Configuration getConfig() {
		return config;
	}

	public void setConfig(Configuration config) {
		this.config = config;
	}

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	

}
