package com.prakhar.parwal.data;

import javax.persistence.Entity;

@Entity
public class User {

	private int id;
	private String firstName;
	private String lastName;
	private Gender gender;
	private UserCredentials userCredentials;
	
	private User() {
		
	}
	
	public User(int id, String firstName, String lastName, Gender gender, UserCredentials userCredentials) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.userCredentials = userCredentials;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}
	
}
