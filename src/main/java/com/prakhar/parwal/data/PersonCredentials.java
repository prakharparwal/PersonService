package com.prakhar.parwal.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON_CREDENTIALS")
public class PersonCredentials {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PERSON_CREDENTIALS_ID")
	private int credential_id;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;
	
	public PersonCredentials() {
		
	}

	public PersonCredentials(int credential_id, String username, String password) {
		super();
		this.credential_id = credential_id;
		this.username = username;
		this.password = password;
	}

	public int getCredential_id() {
		return credential_id;
	}

	public void setCredential_id(int credential_id) {
		this.credential_id = credential_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
