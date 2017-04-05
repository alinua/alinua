package com.alinua.user;

import org.apache.log4j.Logger;


/**
         *  Implémentation de l'interface User
         *         
         * 
         */
public class UserImpl implements User{
	
	private static final Logger logger = Logger.getLogger(UserImpl.class);
	
	/**
         *  Affiche le User
         *         
         * @param none
         */
	public void printUser(){
		System.out.println("printUser() is executed...");
		logger.info("This is Info message");
		
	}

}
