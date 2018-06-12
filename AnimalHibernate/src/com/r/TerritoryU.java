package com.r;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//avec table jointure
@Entity(name="territories")
public class TerritoryU {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idter;
	@Column(name="name")
	private String name;
	
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval=true)
	private List<AnimalOMU> animals = new ArrayList<>();

	public TerritoryU(String name) {
		this.name=name;
		
	}

	public TerritoryU() {
	}

	@Override
	public String toString() {
		return "TerritoryU [idter=" + idter + ", name=" + name + ", animals=" + animals
				+ "]";
	}

	public int getIdter() {
		return idter;
	}

	public void setIdter(int idter) {
		this.idter = idter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public List<AnimalOMU> getAnimals() {
		return animals;
	}

	public void setAnimals(List<AnimalOMU> animals) {
		this.animals = animals;
	}

	
	
	
	
	
	
	
}
