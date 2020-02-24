package com.prakhar.parwal.data;

public class UserCredentials {

	private int credential_id;
	private String username;
	private String password;
	
	public UserCredentials() {
		
	}

	public UserCredentials(int credential_id, String username, String password) {
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
