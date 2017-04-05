package com.m1Info.action;

import org.apache.struts2.json.JSONPopulator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.m1Info.bean.Role;
import com.m1Info.bean.User;
import com.m1Info.dao.UserDao;

public class UserAction {

	private UserDao userDao;
	private String id;
	private JSONObject usersJson = new JSONObject();

	


	public JSONObject getUsersJson() {
		return usersJson;
	}

	public void setUsersJson(JSONObject usersJson) {
		this.usersJson = usersJson;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String addUserAction(){	
		User user=new User();
		user.setEmail("mailUser");
		user.setIdLinkedIn("idLinkedin");
		user.setRole(Role.ALUMNI);
		userDao.addUser(user);		
	
		System.out.println("User ajouté");
		return "success";	
	}	
	
	public String getUserAction(){

		System.out.println(id);
			
		User user=userDao.getUser(id);
		/*
		System.out.println(id);
		System.out.println(user.toString());
		System.out.println(user.toJsonString());
		
		JSONObject ob=new JSONObject();
		try {
			//ob=(JSONObject) new JSONParser().parse(user.toString());
			ob=(JSONObject) new JSONParser().parse(user.toJsonString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//String json_str = new Gson().toJson(user.toString());		
		System.out.println("User recupéré "+ob.toJSONString());
		//usersJson=ob;
		 
		 */
		usersJson.put(id, "value");
		return "success";
	}
	
	public String execute() throws Exception {
		return "success";
	}

}
