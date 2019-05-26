package com.dao.impl;

import com.dao.IUserDAO;
import com.main.Data;
import com.model.User;

public class UserDAOImpl implements IUserDAO {

	@Override
	public User getUser(String username) {
		return Data.userList.get(username);
	}

	@Override
	public User validateUser(String username, String password) {
		User user = this.getUser(username);
		return (user != null && user.getPassword().equals(password)) ? user : null;
	}
}
