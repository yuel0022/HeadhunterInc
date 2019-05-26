package com.main;

import java.util.Scanner;

import com.screen.Screen;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Screen screen = Navigator.LOGIN;
		
		screen.display();
		
		while (!screen.equals(Navigator.EXIT)) {
			screen = screen.acceptCommand();
			screen.display();
		}
	}
}
