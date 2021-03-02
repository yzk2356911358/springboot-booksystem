package com.yzk.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Classify {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	public Classify(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Classify() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Classify [id=" + id + ", name=" + name + "]";
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
	
}
