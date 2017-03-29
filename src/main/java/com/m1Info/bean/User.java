package com.m1Info.bean;

public class User  implements java.io.Serializable {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String headline;
	private String location;
	private String industry;
	private String pictureUrl;
	private String jsonCV;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
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
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public String getJsonCV() {
		return jsonCV;
	}
	public void setJsonCV(String jsonCV) {
		this.jsonCV = jsonCV;
	}


	
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", password=" + password
				+ ", headline=" + headline + ", location=" + location
				+ ", industry=" + industry + ", pictureUrl=" + pictureUrl + "]";
	}
	
	
	
	
	
	

}
