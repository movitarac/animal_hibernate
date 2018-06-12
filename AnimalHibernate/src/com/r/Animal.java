package com.r;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animalunilateral")
public class Animal {
//UNILATERAL
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nom")
	private String nom;
	@Column(name="espece")
	private String espece;
	@Column(name="age")
	private int age;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="teritory_id")
	private Territory territory;
	
	
	public Animal(String nom, String espece, int age) {
		this.nom = nom;
		this.espece = espece;
		this.age = age;
	}

	public Animal() {
	}

	
	
	
	
	public Animal(String nom, String espece, int age, Territory territory) {
		super();
		this.nom = nom;
		this.espece = espece;
		this.age = age;
		this.territory = territory;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nom=" + nom + ", espece=" + espece + ", age=" + age + "]";
	}

	
	
	public Territory getTerritory() {
		return territory;
	}



	public void setTerritory(Territory territory) {
		this.territory = territory;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
