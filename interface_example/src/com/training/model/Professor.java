package com.training.model;

import com.training.intrface.Conditional;

public class Professor implements Conditional {
	
	
	
	private int id;
	private String qualification;

	@Override
	public boolean test() {
		
		return this.qualification.equalsIgnoreCase("mca");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Professor(int id, String qualification) {
		super();
		this.id = id;
		this.qualification = qualification;
	}

	public Professor() {
		super();
		
	}

}
