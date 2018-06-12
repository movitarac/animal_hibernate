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

@Entity(name="territorybilateral")
public class TerritoryBi {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idter;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	
	@OneToOne
	@JoinColumn(name="animal_id")
	private AnimalBi animal;

	
	
	
	public TerritoryBi() {
	}

	
	public TerritoryBi(String name, String location) {
		this.name = name;
		this.location = location;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public AnimalBi getAnimal() {
		return animal;
	}

	public void setAnimal(AnimalBi animal) {
		this.animal = animal;
	}
	
	
	
	
}
