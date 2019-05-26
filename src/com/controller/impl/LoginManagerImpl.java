package com.controller.impl;

import com.controller.ILoginManager;
import com.controller.IMainMenuManager;
import com.dao.IUserDAO;
import com.main.Controllers;
import com.main.Data;
import com.main.Main;
import com.main.Navigator;
import com.model.User;
import com.screen.Screen;

public class LoginManagerImpl implements ILoginManager {
	
	IUserDAO userDAO;
	
	public LoginManagerImpl() {
		this.userDAO = Data.userDAO;
	}

	@Override
	public Screen acceptCommand() {
		User user;
		String username;
		String password;
		
		System.out.print("Username: ");
		username = Main.scanner.next();
		System.out.print("Password: ");
		password = Main.scanner.next();
		
		user = this.userDAO.validateUser(username, password);
		
		if (user == null) {
			System.out.println("Invalid username/password.");
			return Navigator.LOGIN;
		}
		
		// log-in user
		Data.user = user;
		
		return Navigator.MAIN_MENU;
	}
	
	@Override
	public IMainMenuManager loadMenu() {
		User user = Data.user;
		IMainMenuManager menuManager;
		if (user == null) return null;
		
		if (user.getType().equals(User.TYPE.RECRUITER)) {
			menuManager = Controllers.RECRUITER_MENU_MANAGER;
		} else if (user.getType().equals(User.TYPE.RECRUITER)) {
			menuManager = Controllers.INTERVIEWER_MENU_MANAGER;
		} else if (user.getType().equals(User.TYPE.RECRUITER)) {
			menuManager = Controllers.VIEWER_MENU_MANAGER;
		} else {
			menuManager = null;
		}
		
		return menuManager;
	}

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
