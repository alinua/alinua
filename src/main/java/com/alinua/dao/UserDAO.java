package com.alinua.dao;

import java.util.Vector;

import com.alinua.beans.User;

/**
 * 
 *  DAO of the User
 * 
 * @author Sullivan 
 *
 */

public interface UserDAO {

	/**
	* Take an user as parameter and return as result if the save was a success or not.
	
	  @param User 
	  
	  @return true if the save is a success and false if not 
	**/
	public boolean save(User user);
	
	/**
	* Take an user as parameter and return as result if the update of his profile was a success or not.
	
	  @param User
	  
	  @return true if the update is a success and false if not 
	**/
	public boolean update(User user);
	
	/**
	* Take an user as parameter and return as result if the account suppression was a success or not.
	
	  @param User
	  
	  @return true if the remove is a success and false if not 
	**/
	public boolean remove(User user);
	
	/**
	* Return a Vector of all the Users
	
	  @return a list of users
	**/
	public Vector<User> getUsers();
}
