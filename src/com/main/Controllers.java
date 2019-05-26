package com.main;

import com.controller.ILoginManager;
import com.controller.IMainMenuManager;
import com.controller.impl.InterviewerMenuManagerImpl;
import com.controller.impl.LoginManagerImpl;
import com.controller.impl.RecruiterMenuManagerImpl;
import com.controller.impl.ViewerMenuManagerImpl;

public class Controllers {

	public static ILoginManager LOGIN_MANAGER = new LoginManagerImpl();
	public static IMainMenuManager RECRUITER_MENU_MANAGER = new RecruiterMenuManagerImpl();
	public static IMainMenuManager INTERVIEWER_MENU_MANAGER = new InterviewerMenuManagerImpl();
	public static IMainMenuManager VIEWER_MENU_MANAGER = new ViewerMenuManagerImpl();
}
