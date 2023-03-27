package com.hemu.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {

	private Integer id;

	@Size(min = 2, message = "Name should have atleast 2 characters")
	private String name;

	@Past(message = "Birthdate should be in the past")
	private LocalDate BirthDate;

	public User() {
		super();
	}

	public User(Integer id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		BirthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		BirthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", BirthDate=" + BirthDate + "]";
	}

}
