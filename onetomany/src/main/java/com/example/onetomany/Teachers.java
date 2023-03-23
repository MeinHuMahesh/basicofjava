package com.example.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Teachers")

public class Teachers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	@OneToMany(cascade = CascadeType.ALL)
	 List<Courses> courses =new ArrayList<>();
	
	
	


	public Teachers(int id, String name, List<Courses> courses) {
		
		this.id = id;
		this.name = name;
		this.courses = courses;
	}


	public List<Courses> getCourses() {
		return courses;
	}


	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Teachers() {
		// TODO Auto-generated constructor stub
	}

}
