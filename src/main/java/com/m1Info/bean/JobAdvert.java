package com.m1Info.bean;

import java.sql.Date;
import java.sql.Timestamp;


public class JobAdvert implements java.io.Serializable {
	
	private String idJobAdvert;
	private String title;
	private String location;
	private String industry;
	private Timestamp postDate;
	private String description;
	
	public String toJsonString() {
		return "{\"idJobAdvert\"=\"" + idJobAdvert + "\", \"title\"=\"" + title + "\", \"location\"=\"" + location + "\", \"industry\"=\""
				+ industry + "\", \"postDate\"=" + postDate.toString() +"\", \"description\"=\"" + description + "\"}";
	}
	public String getIdJobAdvert() {
		return idJobAdvert;
	}
	public void setIdJobAdvert(String idJobAdvert) {
		this.idJobAdvert = idJobAdvert;
//	MERGING
//	/*
//	 * class bean for ads with standards getter/setter
//	 * 
//	 */
//	
//	private int id;
//	private String title;
//	private String location;
//	private String industry;
//	private String date;
//	private String skills;
//	private String description;
//	private String degree;
//	private int User_id;
//	
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public Timestamp getPostDate() {
		return postDate;
	}
	public void setPostDate(Timestamp postDate) {
		this.postDate = postDate;
	//	MERGING
	//public String getDate() {
	//	return date;
	//}
	//public void setDate(String date) {
	//	this.date = date;
	//}
	//public String getSkills() {
	//	return skills;
	//}
	//public void setSkills(String skills) {
	//	this.skills = skills;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//	MERGING
//	public String getDegree() {
//		return degree;
//	}
//	public void setDegree(String degree) {
//		this.degree = degree;
//	}
//	public int getUser_id() {
//		return User_id;
//	}
//	public void setUser_id(int user_id) {
//		User_id = user_id;
//	}
//
//
//	
//	public String toString() {
//		/*
//		 * return a string representation of the instance
//		 * 
//		 * @return	string concatenation of attribute/value
//		 */
//		return "JobAdvert [id=" + id + ", title=" + title + ", location="
//				+ location + ", industry=" + industry + ", date=" + date
//				+ ", skills=" + skills + ", description=" + description
//				+ ", degree=" + degree + ", User_id=" + User_id + "]";
//	}
//	
//	
//	
//	
//	
//
}
