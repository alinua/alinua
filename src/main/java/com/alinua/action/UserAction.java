package com.alinua.action;

import com.alinua.beans.User;
import com.alinua.dao.UserDAO;

/**
         *  Classe d'action User
         *   
         */
public class UserAction {
	
	private UserDAO userDao;
	
	/**
         *  getter de User DAO
         *   
	 * @return {UserDAO} userDao
         */
	public UserDAO getUserDAO() {
		return userDao;
	}

	/**
         *  setter de User DAO
         *   
	 * @param {UserDAO} userDao
         */
	public void setUserDAO(UserDAO userDao) {
		this.userDao = userDao;
	}

	/**
         *  Ajout de User Action
         *   
	 * @return {String} Success or null
         */
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
	
	/**
         *  Execution de l'action
         *   
	 * @throws Exeption
	 * @return {String} Success or null
         */
	public String execute() throws Exception {
		


		return "success";

	}


}
