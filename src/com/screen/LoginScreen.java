package com.screen;

import com.controller.ILoginManager;
import com.main.Controllers;
import com.main.Navigator;

public class LoginScreen extends Screen {
	
	private ILoginManager loginManager;
	
	public LoginScreen() {
		loginManager = Controllers.LOGIN_MANAGER;
		this.setManager(loginManager);
	}

	@Override
	public Screen acceptCommand() {
		Screen screen = loginManager.acceptCommand();
		
		if (Navigator.MAIN_MENU.equals(screen)) {
			((MainMenuScreen)screen).setMenuManager(loginManager.loadMenu());
		}
		
		return screen;
	}
	
	@Override
	public void display() {
		System.out.println("Please enter username and password:");
	}
}
