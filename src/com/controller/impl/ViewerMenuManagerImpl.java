package com.controller.impl;

import java.util.ArrayList;
import java.util.List;

import com.controller.IMainMenuManager;
import com.screen.MainMenuScreen;
import com.screen.Screen;

public class ViewerMenuManagerImpl implements IMainMenuManager {

	@Override
	public Screen acceptCommand() {
		return null;
	}

	@Override
	public List<String> loadMenu() {
		List<String> menu = new ArrayList<String>();
		menu.add(MainMenuScreen.OPTION_VIEW_JOBSEEKERS);
		menu.add(MainMenuScreen.OPTION_VIEW_JOBSEEKERS_RECOMMENDED);
		menu.add(MainMenuScreen.OPTION_EXIT);
		
		return menu;
	}
}
