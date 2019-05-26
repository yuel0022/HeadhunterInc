package com.model;

public abstract class User {
	
	public static enum TYPE {RECRUITER, INTERVIEWER, VIEWER};

	private String username;
	private String password;
	private String name;
	private TYPE type;
	
	public User(String username, String password, String name, TYPE type) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.type = type;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TYPE getType() {
		return type;
	}
	public void setType(TYPE type) {
		this.type = type;
	}
}
