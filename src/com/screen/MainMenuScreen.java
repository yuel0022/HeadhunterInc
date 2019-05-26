package com.screen;

import java.util.List;

import com.controller.IMainMenuManager;

public class MainMenuScreen extends Screen {
	
	public static String OPTION_VIEW_JOBSEEKERS = "V";
	public static String OPTION_VIEW_SUGGESTED_JOBSEEKERS = "S";
	public static String OPTION_VIEW_SHORTLISTED_JOBSEEKERS = "H";
	public static String OPTION_VIEW_ASSIGNED_INTERVIEWEES = "I";
	public static String OPTION_VIEW_JOBSEEKERS_RECOMMENDED = "R";
	public static String OPTION_EXIT = "E";
	
	public static String TEXT_VIEW_JOBSEEKERS = "View Jobseeker List";
	public static String TEXT_VIEW_SUGGESTED_JOBSEEKERS = "View Suggested Jobseekers";
	public static String TEXT_VIEW_SHORTLISTED_JOBSEEKERS = "View Shortlisted Jobseekers";
	public static String TEXT_VIEW_ASSIGNED_INTERVIEWEES = "View Assigned Interviewees";
	public static String TEXT_VIEW_JOBSEEKERS_RECOMMENDED = "View Jobseekers I Recommended";
	public static String TEXT_EXIT = "Exit";
	
	IMainMenuManager menuManager;

	public MainMenuScreen() {
		this.menuManager = null;
	}
	
	@Override
	public Screen acceptCommand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		List<String> menu = this.menuManager.loadMenu();
		System.out.println("Please select an option (Enter the corresponding letter inside the parenthesis):");
		for (String option : menu) {
			displayMenuText(option);
		}
	}
	
	private void displayMenuText(String option) {
		if (OPTION_VIEW_JOBSEEKERS.equals(option)) {
			System.out.print(TEXT_VIEW_JOBSEEKERS);
		} else if (OPTION_VIEW_SUGGESTED_JOBSEEKERS.equals(option)) {
			System.out.print(TEXT_VIEW_SUGGESTED_JOBSEEKERS);
		} else if (OPTION_VIEW_SHORTLISTED_JOBSEEKERS.equals(option)) {
			System.out.print(TEXT_VIEW_SHORTLISTED_JOBSEEKERS);
		} else if (OPTION_VIEW_ASSIGNED_INTERVIEWEES.equals(option)) {
			System.out.print(TEXT_VIEW_ASSIGNED_INTERVIEWEES);
		} else if (OPTION_VIEW_JOBSEEKERS_RECOMMENDED.equals(option)) {
			System.out.print(TEXT_VIEW_JOBSEEKERS_RECOMMENDED);
		} else if (OPTION_EXIT.equals(option)) {
			System.out.print(TEXT_EXIT);
		}
		
		System.out.println(" (" + option + ")");
	}

	public IMainMenuManager getMenuManager() {
		return menuManager;
	}

	public void setMenuManager(IMainMenuManager menuManager) {
		this.menuManager = menuManager;
		this.setManager(this.menuManager);
	}
}
