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

@Entity(name="animalbilateral")
public class AnimalBi {
//bilateral
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
	private TerritoryBi territory;

	
	public void addTerritory(TerritoryBi territory) {
		territory.setAnimal(this);
		this.territory=territory;
	}
	
	
	
	public AnimalBi() {
	}

	public AnimalBi(String nom, String espece, int age) {
		this.nom = nom;
		this.espece = espece;
		this.age = age;
	}

	
	
	
	@Override
	public String toString() {
		return "AnimalBi [id=" + id + ", nom=" + nom + ", espece=" + espece + ", age=" + age + ", territory="
				+ territory + "]";
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



	public TerritoryBi getTerritory() {
		return territory;
	}



	public void setTerritory(TerritoryBi territory) {
		this.territory = territory;
	}


	
	
	
}
