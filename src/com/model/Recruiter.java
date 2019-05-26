package com.model;

public class Recruiter extends User {

	public Recruiter(String username, String password, String name) {
		super(username, password, name, User.TYPE.RECRUITER);
	}
}
