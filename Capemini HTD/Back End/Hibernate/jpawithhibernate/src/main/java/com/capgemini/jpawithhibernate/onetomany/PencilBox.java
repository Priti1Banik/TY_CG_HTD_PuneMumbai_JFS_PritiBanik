package com.capgemini.jpawithhibernate.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pencilbox")
public class PencilBox {

	@Id
	@Column
	private int boxid;
	@Column
	private String name;
	
	public int getBoxid() {
		return boxid;
	}
	public void setBoxid(int boxid) {
		this.boxid = boxid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@OneToMany(mappedBy="pencilbox")  //mappedBy means bidirectional mapping
	private List<Pencil> pencil;     //list is used because many pencil present

	public List<Pencil> getPencil() {
		return pencil;
	}
	public void setPencil(List<Pencil> pencil) {
		this.pencil = pencil;
	}
	
}
