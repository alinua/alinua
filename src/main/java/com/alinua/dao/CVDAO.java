package com.alinua.dao;

import java.util.Vector;

import com.alinua.beans.CV;

/**
 * 
 *  DAO of the cv
 * 
 * @author Sullivan 
 *
 */
public interface CVDAO {

	/**
	* Take a CV as parameter and return as result if the save was a success or not.
	*
	* @param CV 
	*  
	*  @return true if the save is a success and false if not 
	**/
	public boolean save(CV cv);
	
	/**
	* Take a CV as parameter and return as result if the update of the CV was a success or not.
	*
	* @param CV
	*  
	* @return true if the update of the CV is a success and false if not 
	**/
	public boolean update(CV cv);
	
	/**
	* Take a CV as parameter and return as result if the supression of the CV was a success or not.
	*
	* @param CV
	*  
	* @return true if the supression of the CV is a success and false if not 
	**/
	public boolean remove(CV cv);
	
	/**
	* Return a vector of all the CV
	*
	* @return a list of all the CV 
	**/
	public Vector<CV> getCVs();
}
