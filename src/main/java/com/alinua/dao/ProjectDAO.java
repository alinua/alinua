package com.alinua.dao;

import java.util.Vector;

import com.alinua.beans.Project;

/**
 * 
 *  Project DAO
 * 
 * @author  Sullivan 
 *
 */


public interface ProjectDAO {
	
	/**
	* Take a project as parameter and return as result if the save was a success or not.
	
	  @param Project 
	  
	  @return true if the save is a success and false if not 
	**/
	public boolean save(Project project);
	
	/**
	* Take a project as parameter and return as result if the update of the project was a success or not.
	
	  @param Project
	  
	  @return true if the update is a success and false if not 
	**/
	public boolean update(Project project);
	
	/**
	* Take a project as parameter and return as result if the project was successfully deleted
	
	  @param Project
	  
	  @return true if the project get removed and false if not 
	**/
	public boolean remove(Project project);
	
	/**
	* Return a Vector of all the Projects
	
	  @return a list of Project
	**/
	public Vector<Project> getProjects();
}
