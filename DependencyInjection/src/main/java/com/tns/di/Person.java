package com.tns.di;

public class Person {
	private Job j;

	public Job getJ() {
		return j;
	}

	public void setJ(Job j) {
		System.out.println("Setter injection");
		this.j = j;
	}

	public Person(Job j) {
		System.out.println("Constructor Injection");
		this.j = j;
	}
	
	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [j=" + j + "]";
	}
	
}
