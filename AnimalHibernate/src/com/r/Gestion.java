package com.r;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Gestion {
	Configuration config = new Configuration();
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	Animal animal;
	Territory territory;
	
	// private Animal animal;
	public Gestion(SessionFactory factory) {
		this.factory = factory;
	}

	public Gestion() {
	}

	
	public void addanimal(Animal animal) {
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(animal);
		session.getTransaction().commit();
		session.close();
	}
	
	public void updateanimal(Animal animal) {
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.saveOrUpdate(animal);
		session.getTransaction().commit();
		session.close();
	}
	

	public void read() {
		Session session = factory.openSession();
		Animal cocolecoq = new Animal("cocolecoq", "Rooster", 4);
		session.beginTransaction();
		int idRooster = (int)session.save(cocolecoq);
		session.getTransaction().commit();
		
		session.beginTransaction();
		Animal cobaye = session.get(Animal.class, idRooster);
		//System.out.println(cobaye);
		session.getTransaction().commit();
		session.beginTransaction();
		List<Animal> result = session.createQuery("from Animal A WHERE A.espece LIKE 'A%' ORDER BY A.nom").list();
		for (Animal a : result) {
			System.out.println(a);
		}
		session.getTransaction().commit();
	}
	
	public void exemple() {
		String espece = "Rooster";
		Session session = factory.openSession();
		session.beginTransaction();
		//prepare la transaction en indiquant une variable avec:
		Query query = session.createQuery("from Animal A WHERE A.espece=:esp ");
		//application le remplacement de la variable
		query.setParameter("esp", espece);
		//recuperation les resultats de la requete
		List<Animal> result = query.list();
		for (Animal event : (List<Animal>) result) {
			System.out.println(event);
		}
		session.getTransaction().commit();
		session.close();
	
	
	}
	
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
}
