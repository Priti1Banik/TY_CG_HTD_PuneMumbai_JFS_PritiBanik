package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {

	@Id
	@Column
	private int pid;
	@Column
	private String name;



	@OneToOne(cascade=CascadeType.ALL)             //cascade.all is use to perform all DML operation with single statement
	@JoinColumn(name="vid")                     //similar to joining foreign key
	private VoterCard votercard;

	public VoterCard getVotercard() {
		return votercard;
	}
	public void setVotercard(VoterCard votercard) {
		this.votercard = votercard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}

}

