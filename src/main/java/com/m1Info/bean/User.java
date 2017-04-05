package com.m1Info.bean;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.google.gson.Gson;
import com.google.gson.JsonSerializer;

public class User  implements java.io.Serializable {
	
	private String idLinkedIn;
	private String email;
	@Enumerated(EnumType.ORDINAL)
	private Role role;
	@OneToMany(fetch=FetchType.EAGER)
	private Set<JobAdvert> jobAdverts = new HashSet<JobAdvert>();
	@OneToMany(fetch=FetchType.EAGER)
	private Set<JobAdvert> archivedJobAdverts = new HashSet<JobAdvert>();
	
	
	public User(){
		jobAdverts = new HashSet<JobAdvert>();
		archivedJobAdverts = new HashSet<JobAdvert>();
	}
	
	public String getIdLinkedIn() {
		return idLinkedIn;
//MERGING
//public class User  implements java.io.Serializable {
//	
//	/*
//	 * class bean for user with standar getter/setter
//	 * 
//	 */
//	
//	private int id;
//	private String firstName;
//	private String lastName;
//	private String email;
//	private String password;
//	private String headline;
//	private String location;
//	private String industry;
//	private String pictureUrl;
//	private String jsonCV;
//	
//	
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmail() {
//		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public void setIdLinkedIn(String idLinkedIn) {
		this.idLinkedIn = idLinkedIn;
	}
	public Set<JobAdvert> getJobAdverts() {
		return jobAdverts;
	}
	public void setJobAdverts(Set<JobAdvert> jobAdverts) {
		this.jobAdverts = jobAdverts;
	}
	public Set<JobAdvert> getArchivedJobAdverts() {
		return archivedJobAdverts;
	}
	public void setArchivedJobAdverts(Set<JobAdvert> archivedJobAdverts) {
		this.archivedJobAdverts = archivedJobAdverts;
	}
	public String getEmail() {
		return email;
	}

	public String toString() {
		return "User [idLinkedIn=" + idLinkedIn + ", email=" + email + ", role=" + role + "]";
	}
	
	public String toJsonString() {
		String ret = "{\"idLinkedIn\":\"" + idLinkedIn + "\",\n\"email\":\"" + email + "\",\n\"role\":\"" + role + "\",\n"
				+ "\"jobAdverts\":[\n";

		//System.out.println(ret);
		/*
		if(jobAdverts != null){
			for (JobAdvert ja : jobAdverts)
				ret += ja.toJsonString();
		}
		*/
		ret += "]\n\"archivedJobAdverts\":[\n";
		/*if(archivedJobAdverts != null){
			for (JobAdvert ja : archivedJobAdverts)
				ret += ja.toJsonString();
		}*/
		ret += "]\n}";
		return ret;
	}
//	MERGING
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getHeadline() {
//		return headline;
//	}
//	public void setHeadline(String headline) {
//		this.headline = headline;
//	}
//	public String getLocation() {
//		return location;
//	}
//	public void setLocation(String location) {
//		this.location = location;
//	}
//	public String getIndustry() {
//		return industry;
//	}
//	public void setIndustry(String industry) {
//		this.industry = industry;
//	}
//	public String getPictureUrl() {
//		return pictureUrl;
//	}
//	public void setPictureUrl(String pictureUrl) {
//		this.pictureUrl = pictureUrl;
//	}
//	public String getJsonCV() {
//		return jsonCV;
//	}
//	public void setJsonCV(String jsonCV) {
//		this.jsonCV = jsonCV;
//	}
//
//
//	
//	public String toString() {
//		
//		/*
//		 *  return a string representation of the instance
//		 * 
//		 * @return	string concatenation of attribute/value
//		 */
//		return "User [id=" + id + ", firstName=" + firstName + ", lastName="
//				+ lastName + ", email=" + email + ", password=" + password
//				+ ", headline=" + headline + ", location=" + location
//				+ ", industry=" + industry + ", pictureUrl=" + pictureUrl + "]";
//	}
//	
//	
//	
//	
//	
//	
//
}
