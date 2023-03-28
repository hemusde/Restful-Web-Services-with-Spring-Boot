package com.hemu.rest.webservices.restfulwebservices.versioning;

public class PersonV2 {

	private String firstname;
	private String lastname;

	public PersonV2(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	@Override
	public String toString() {
		return "PersonV2 [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
