package com.example.webSimple.entities;

public class Department {
	private long id;
	private String name;
	/*
	 * TODO private static list<department> departments;
	 */

	public Department(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
