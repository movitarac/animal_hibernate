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

@Entity(name="animals")
public class AnimalOMU {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nom")
	private String nom;
	@Column(name="espece")
	private String espece;
	@Column(name="age")
	private int age;
	
	
	public AnimalOMU() {
	}


	public AnimalOMU(String nom, String espece, int age) {
		super();
		this.nom = nom;
		this.espece = espece;
		this.age = age;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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
