package com.selfLearning.springBootCrud.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="Subject")
public class Subject {

	@Id
	String Id;
	String name;
	
	public Subject() {
		
	}
	
	public Subject(String id, String name) {
		super();
		Id = id;
		this.name = name;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
