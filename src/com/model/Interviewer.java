package com.model;

public class Interviewer extends User {

	public Interviewer(String username, String password, String name) {
		super(username, password, name, User.TYPE.INTERVIEWER);
	}
}
