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
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
