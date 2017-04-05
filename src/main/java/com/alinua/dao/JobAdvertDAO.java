package com.alinua.dao;

import java.util.Vector;

import com.alinua.beans.JobAdvert;


/**
 * 
 *  JobAdvert DAO
 * 
 * @author Sullivan 
 *
 */

public interface JobAdvertDAO {
	
	/**
	* Take a JobAdvert as parameter and return as result if the save was a success or not.
	
	  @param JobAdvert 
	  
	  @return true if the save is a success and false if not 
	**/
	public boolean save(JobAdvert jobAdvert);
	
	/**
	* Take a JobAdvert as parameter and return as result if the update was a success or not.
	
	  @param JobAdvert
	  
	  @return true if the update is a success and false if not 
	**/
	public boolean update(JobAdvert jobAdvert);
	
	/**
	* Take a JobAdvert as parameter and return as result if the suppression was a success or not.
	
	  @param JobAdvert
	  
	  @return true if the remove is a success and false if not 
	**/
	public boolean remove(JobAdvert jobAdvert);
	
	/**
	* Return a Vector of all the JobAdvert
	
	  @return a list of JobAdvert
	**/
	public Vector<JobAdvert> getJobAdverts();
}
