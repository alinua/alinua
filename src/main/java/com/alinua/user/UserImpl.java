package com.alinua.user;

import org.apache.log4j.Logger;


public class UserImpl implements User{
	
	private static final Logger logger = Logger.getLogger(UserImpl.class);

	public void printUser(){
		System.out.println("printUser() is executed...");
		logger.info("This is Info message");
		
	}

}
