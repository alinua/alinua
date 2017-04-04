package com.alinua.beans;

import java.io.Serializable;
import java.util.Vector;

/**
 * 
 * @author Yannick ADECHI
 *
 */
public class User implements Serializable {

	/**
	 * Default constructor
	 */
	public User(){
		
	}
	
	/**
	 * Constructor using fields
	 * 
	 * @param email
	 * @param idLinkedin
	 * @param role
	 * @param jobAdverts
	 * @param archivedJobAdverts
	 */
	public User(String email, String idLinkedin, Role role, Vector<JobAdvert> jobAdverts,
			Vector<JobAdvert> archivedJobAdverts) {
		super();
		this.email = email;
		this.idLinkedin = idLinkedin;
		this.role = role;
		this.jobAdverts = jobAdverts;
		this.archivedJobAdverts = archivedJobAdverts;
	}
	
	
	/**
	 *  The email of the user
	 */
	private String email;
	
	/**
	 * The id of the Linkedin's user
	 */
	private String idLinkedin;
	
	/**
	 *  The role of the user
	 *  @see class Role
	 */
	private Role role;
	
	/**
	 *  The list of user's job adverts
	 *  @see class JobAdvert
	 */
	private Vector<JobAdvert> jobAdverts;
	
	/**
	 *  The list of job adverts archived by the user
	 */
	private Vector<JobAdvert> archivedJobAdverts;
	
	
	/// GETTERS n SETTERS
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email  the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the idLinkedin
	 */
	public String getIdLinkedin() {
		return idLinkedin;
	}
	
	/**
	 * @param idLinkedin  the idLinkedin to set
	 */
	public void setIdLinkedin(String idLinkedin) {
		this.idLinkedin = idLinkedin;
	}
	
	/**
	 * @return the role
	 * @see class Role
	 */
	public Role getRole() {
		return role;
	}
	
	/**
	 * @param role  the role to set
	 * @see class Role
	 */
	public void setRole(Role role) {
		this.role = role;
	}
	
	/**
	 * @return the jobAdverts
	 * @see class JobAdvert
	 */
	public Vector<JobAdvert> getJobAdverts() {
		return jobAdverts;
	}
	
	/**
	 * @param jobAdverts  the jobAdverts to set
	 * @see class JobAdvert
	 */
	public void setJobAdverts(Vector<JobAdvert> jobAdverts) {
		this.jobAdverts = jobAdverts;
	}
	
	/**
	 * @return the archivedJobAdverts
	 * @see class JobAdvert
	 */
	public Vector<JobAdvert> getArchivedJobAdverts() {
		return archivedJobAdverts;
	}
	
	/**
	 * @param archivedJobAdverts  the archivedJobAdverts to set
	 * @see class JobAdvert
	 */
	public void setArchivedJobAdverts(Vector<JobAdvert> archivedJobAdverts) {
		this.archivedJobAdverts = archivedJobAdverts;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [email=" + email + ", idLinkedin=" + idLinkedin + ", role=" + role + ", jobAdverts=" + jobAdverts
				+ ", archivedJobAdverts=" + archivedJobAdverts + "]";
	}
	
	
}
