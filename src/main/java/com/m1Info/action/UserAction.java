package com.m1Info.action;

import com.m1Info.bean.User;
import com.m1Info.dao.UserDao;


public class UserAction {
	
	private UserDao userDao;
	
	
	
	
	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public String addUserAction(){
	
		User user=new User();
		user.setEmail("mailUser");
		user.setFirstName("firstName");
		user.setHeadline("headline");
		user.setIndustry("industry");
		user.setJsonCV("jsonCV");
		user.setLastName("lastName");
		user.setLocation("location");
		user.setPassword("password");
		user.setPictureUrl("pictureUrl");
		
		userDao.addUser(user);
	
		
	
		System.out.println("User ajouté");
		return "success";
	
	}
	
	
	public String getUserAction(){
		

		int id=4;
		User user=userDao.getUser(id);
		System.out.println("User recupéré "+user.toString());
		return "success";
	
	}
	
	public String execute() throws Exception {
		


		return "success";

	}


}
