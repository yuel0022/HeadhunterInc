package com.screen;

public class ExitScreen extends Screen {

	@Override
	public Screen acceptCommand() {
		return null;
	}
	
	@Override
	public void display() {
		System.out.println("Goodbye!");
	}

}
