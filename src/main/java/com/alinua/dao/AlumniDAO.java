package com.alinua.dao;

import java.util.Vector;
import com.alinua.beans.Alumni;


/**
 * 
 *  DAO of the Alumni
 * 
 * @author Sullivan 
 *
 */
public interface AlumniDAO {

	/**
	* Take an alumni as parameter and return as result if the save was a success or not.
	*
	*  @param Alumni 
	*  
	*  @return true if the save is a success and false if not 
	**/
	public boolean save(Alumni alumni);
	
	/**
	* Take an alumni as parameter and return as result if the update was a success or not.
	*
	*  @param Alumni 
	*  
	*  @return true if the update is a success and false if not 
	**/
	public boolean update(Alumni alumni);
	
	/**
	* Take an alumni as parameter and return as result if the supression was a success or not.
	*
	*  @param Alumni 
	*  
	*  @return true if the supression is a success and false if not 
	**/
	public boolean remove(Alumni alumni);
	
	/**
	* Return a Vector of all the Alumnis
	
	  @return a list of Alumnis
	**/
	public Vector<Alumni> getAlumnis();
}
