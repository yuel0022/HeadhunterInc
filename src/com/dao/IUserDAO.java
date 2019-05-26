package com.dao;

import com.model.User;

public interface IUserDAO {

	public User getUser(String username);
	
	public User validateUser(String username, String password);
}
