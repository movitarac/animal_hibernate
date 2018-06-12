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

//unilateral
@Entity
@Table(name="territoryunilateral")
public class Territory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idter;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	
	
	public Territory(String name, String location) {
		this.name = name;
		this.location = location;
	}

	
	
	public Territory() {
	}
	
	@Override
	public String toString() {
		return "Territory [idter=" + idter + ", nameter=" + name + ", location=" + location + "]";
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

	
}
