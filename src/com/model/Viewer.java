package com.model;

public class Viewer extends User {

	public Viewer(String username, String password, String name) {
		super(username, password, name, User.TYPE.VIEWER);
	}
}
