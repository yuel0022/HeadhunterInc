package com.screen;

import com.controller.IManager;

public abstract class Screen {

	private IManager manager;
	
	public abstract Screen acceptCommand();
	
	public abstract void display();

	public IManager getManager() {
		return manager;
	}

	public void setManager(IManager manager) {
		this.manager = manager;
	}
}
