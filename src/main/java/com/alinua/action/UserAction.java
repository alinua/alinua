package com.alinua.action;

import com.alinua.beans.User;
import com.alinua.dao.UserDAO;


public class UserAction {
	
	private UserDAO userDao;
	
		
	public UserDAO getUserDAO() {
		return userDao;
	}


	public void setUserDAO(UserDAO userDao) {
		this.userDao = userDao;
	}


	public String addUserAction(){
	
		///User user=new User("nb", "btynvfg", "btycdeern", "btynnnnnnn", "buyyttyn", "btvvvvvvyn", "btyn111111", "btiiiiiiiyn", "bbbbtyn");
		
	
		
	
		System.out.println("User ajouté");
		return "success";
	
	}
	
	
	/*public String getUserAction(){
		

		int id=4;
		User user = userDao.getUser(id);
		System.out.println("User recupéré "+user.toString());
		return "success";
	
	}*/
	
	public String execute() throws Exception {
		


		return "success";

	}


}
