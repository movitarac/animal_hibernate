package com.r;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Animal hawai = new Animal("Hawai", "Sumatran Tiger", 10);
		Animal pocoloco = new Animal("Pocoloco", "Tabby Cat", 4);
		Animal dauphine = new Animal("Dauphine", "Dolphin", 5);
		Animal rock = new Animal("Rock", "Whale", 5);
		Animal poppin = new Animal("Poppin", "Hippopotamus", 7);
		Gestion g = new Gestion();
		
		GestionTBi gt = new GestionTBi();
		
		//////UNILATERAL/////
		Territory t1 = new Territory("Lalaland","Christmas Island");
		Territory t2 = new Territory("Everest","Nepal");
		Territory t3 = new Territory("Savaland","Mongolia");
		Territory t4 = new Territory("Safari","South Africa");
		Territory t5 = new Territory("Rimba","Indonesia");
		
		hawai.setTerritory(t5);
		pocoloco.setTerritory(t2);
		dauphine.setTerritory(t3);
		rock.setTerritory(t1);
		poppin.setTerritory(t1);
		g.addanimal(hawai);
		g.addanimal(pocoloco);
		g.addanimal(dauphine);
		g.addanimal(rock);
		g.addanimal(poppin);
		
		//BILATERAL//
		AnimalBi hawai1 = new AnimalBi("Hawai", "Sumatran Tiger", 10);
		AnimalBi pocoloco1 = new AnimalBi("Pocoloco", "Tabby Cat", 4);
		AnimalBi dauphine1 = new AnimalBi("Dauphine", "Dolphin", 5);
		AnimalBi rock1 = new AnimalBi("Rock", "Whale", 5);
		AnimalBi poppin1 = new AnimalBi("Poppin", "Hippopotamus", 7);
		
		TerritoryBi te1 = new TerritoryBi("Lalaland","Christmas Island");
		TerritoryBi te2 = new TerritoryBi("Everest","Nepal");
		TerritoryBi te3 = new TerritoryBi("Savaland","Mongolia");
		TerritoryBi te4 = new TerritoryBi("Safari","South Africa");
		TerritoryBi te5 = new TerritoryBi("Rimba","Indonesia");
		
		hawai1.addTerritory(te1);
		gt.addAnimal(hawai1);
		
		pocoloco1.addTerritory(te2);
		gt.addAnimal(pocoloco1);
		
		dauphine1.addTerritory(te3);
		gt.addAnimal(dauphine1);
		
		rock1.addTerritory(te4);
		gt.addAnimal(rock1);
		
		poppin1.addTerritory(te5);
		gt.addAnimal(poppin1);
		
		
		///onetomany////
		
		Gestionone go = new Gestionone();
		TerritoryU tu1 = new TerritoryU("Lalaland");
		TerritoryU tu2 = new TerritoryU("Everest");
		//TerritoryU tu3 = new TerritoryU("Savaland");
		//TerritoryU tu4 = new TerritoryU("Safari");
		//TerritoryU tu5 = new TerritoryU("Rimba");
		
		
		AnimalOMU ahawai1 = new AnimalOMU("Hawai", "Sumatran Tiger", 10);
		AnimalOMU apocoloco1 = new AnimalOMU("Pocoloco", "Tabby Cat", 4);
		AnimalOMU adauphine1 = new AnimalOMU("Dauphine", "Dolphin", 5);
		AnimalOMU arock1 = new AnimalOMU("Rock", "Whale", 5);
		AnimalOMU apoppin1 = new AnimalOMU("Poppin", "Hippopotamus", 7);
		
		tu1.getAnimals().add(ahawai1);
		tu1.getAnimals().add(apocoloco1);
		tu2.getAnimals().add(adauphine1);
		tu2.getAnimals().add(arock1);
		tu2.getAnimals().add(apoppin1);
		go.addTerritory(tu1);
		go.addTerritory(tu2);
	}
	

	
}
