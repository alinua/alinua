package com.alinua.beans;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * @author Yannick ADECHI
 *
 */
public class JobAdvert implements Serializable {

	
	/**
	 * Default constructor
	 */
	public JobAdvert() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor using fields
	 * 
	 * 
	 * @param idJobAdvert
	 * @param title
	 * @param location
	 * @param industry
	 * @param postDate
	 * @param description
	 */
	public JobAdvert(String idJobAdvert, String title, String location, String industry, Timestamp postDate,
			String description) {
		super();
		this.idJobAdvert = idJobAdvert;
		this.title = title;
		this.location = location;
		this.industry = industry;
		this.postDate = postDate;
		this.description = description;
	}
	
	/**
	 * Identifier of the job advert
	 */
	private String idJobAdvert;
	
	/**
	 * Title of the job adevrt
	 */
	private String title;
	
	/**
	 * Location of the job advert
	 */
	private String location;
	
	/**
	 * Company posting the job advert
	 */
	private String industry;
	
	/**
	 * The date the job advert was posted
	 */
	private Timestamp postDate;
	
	/**
	 * The description of the job advert
	 */
	private String description;
	
	
	/// GETTERS n SETTERS
	/**
	 * @return the idJobAdvert
	 */
	public String getIdJobAdvert() {
		return idJobAdvert;
	}
	
	/**
	 * @param idJobAdvert the idJobAdvert to set
	 */
	public void setIdJobAdvert(String idJobAdvert) {
		this.idJobAdvert = idJobAdvert;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/**
	 * @return the industry
	 */
	public String getIndustry() {
		return industry;
	}
	
	/**
	 * @param industry the industry to set
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	
	/**
	 * @return the postDate
	 */
	public Timestamp getPostDate() {
		return postDate;
	}
	
	/**
	 * @param postDate the postDate to set
	 */
	public void setPostDate(Timestamp postDate) {
		this.postDate = postDate;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JobAdvert [idJobAdvert=" + idJobAdvert + ", title=" + title + ", location=" + location + ", industry="
				+ industry + ", postDate=" + postDate + ", description=" + description + "]";
	}
	
}
