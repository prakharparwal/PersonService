package com.prakhar.parwal.data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {

	@Id
	@Column(name = "PERSON_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME" )
	private String lastName;
	
	@Column(name = "GENDER")
	private Gender gender;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name =  "PERSON_CREDENTIAL_ID")
	private PersonCredentials personCredentials;
	
	public Person() {
		
	}
	
	public Person(int id, String firstName, String lastName, Gender gender, PersonCredentials personCredentials) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.personCredentials = personCredentials;
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

	public PersonCredentials getPersonCredentials() {
		return personCredentials;
	}

	public void setPersonCredentials(PersonCredentials personCredentials) {
		this.personCredentials = personCredentials;
	}
	
}
