package com.main;

import java.util.HashMap;
import java.util.Map;

import com.dao.IUserDAO;
import com.dao.impl.UserDAOImpl;
import com.model.Interviewer;
import com.model.Recruiter;
import com.model.User;
import com.model.Viewer;

public class Data {

	public static User user = null; // the logged in user in session
	
	public static Map<String, User> userList = new HashMap<String, User>();
	
	public static IUserDAO userDAO = new UserDAOImpl();
	
	static {
		userList.put("jakesugue", new Recruiter("jakesugue", "password1", "JVS Datababes Inc."));
		userList.put("pandong101", new Interviewer("pandong101", "password1", "Oneb Lim"));
		userList.put("pabloviewer", new Viewer("pablo", "password1", "Pablo Mando"));
		
		userList.put("bok", new Recruiter("bok", "password1", "For Lopp Association"));
		userList.put("jbreyes", new Recruiter("jbreyes", "password1", "JB Reyes"));
		userList.put("octa", new Recruiter("octa", "password1", "Tita Octa"));
	}
}
