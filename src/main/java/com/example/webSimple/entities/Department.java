package com.example.webSimple.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Department {
	private long id;
	private String name;
	/*
	 * TODO private static list<department> departments;
	 */
	
	@JsonCreator
	public Department(@JsonProperty("id") long id,@JsonProperty("name") String name) {
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
