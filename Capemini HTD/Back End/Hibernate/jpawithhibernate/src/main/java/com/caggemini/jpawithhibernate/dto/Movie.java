package com.caggemini.jpawithhibernate.dto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="movie")
public class Movie {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)           //this will help to generate primary key and hence no getter-setter method is required
	private int id;
	@Column
	private String name;
	@Column
	private String rating;
	
	
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
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
}
