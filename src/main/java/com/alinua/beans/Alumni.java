package com.alinua.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Vector;

import org.json.simple.JSONObject;

/**
 * <p> An Alumni possess the role 'alumni', thus : </p>
 * <ul>
 * 	<li> he can create/read/update/archive all kind of adverts (jobadvert,announcement).
 * 	<li> he can create/read/update projects
 * 	<li> he can export his CV into XML, ODT, PDF
 * </ul>
 *
 * <p> An Alumni object encapsulates basics information (such as firstname, name, birthdate...) 
 * into an JSON file. It has also a schoolyear and a profile picture. </p> 
 *
 * @author Mariam Bouzid
 */
public class Alumni implements Serializable {

	 /**
     * Default constructor
	 * Useful for test.
	 * 
     */
    public Alumni() {
		this.year = 1789;
		this.description = null;
		this.lastUpdated = new Timestamp (0);
		this.pictureUrl = "lol";
    }

	 /**
     * Constructor
     *
	 * @param year			the schooyear
	 * @param description	the JSON description retrieved from LinkedIn
	 * @param lastUpdated	the update date related to the CV retrieving 
	 * @param pictureUrl	the picture url
     */
    public Alumni(int year, JSONObject description, Timestamp lastUpdated, String pictureUrl ) {
		this.year = year;
		this.description = description;
		this.lastUpdated = lastUpdated;
		this.pictureUrl = pictureUrl;
    }

    /**
     * Represents the school year
     */
    private int year;

    /**
     * Contains description retrieved from LinkedIn:
	 * 	{
  	 *		"firstName": "Jean-Kévin",
	 * 		"lastName": "Dupont"
	 *		"birthDate": "11/09/2001",
  	 *		"location": "Angers,France"
	 *	}
	 * 
     */
    private JSONObject description;

    /**
     * Represents last update time.
     */
    private Timestamp lastUpdated;

    /**
     * This is the picture url, represented as a String. 
     */
    private String pictureUrl;

    /**
     * This represents the basic user informations
	 * linked to this Alumni 
     */
    private User user;

    /**
     * The Alumni's projects are stored into a vector.
	 * 
     */
    private Vector<Project> projects;

    /**
     * The Alumni's CV is stored here.
     */
    private CV cv;

    /**
     * @return the year
     */
    public int getYear() {
        return this.year;
    }

    /**
     * @return the JSON file
     */
    public JSONObject getDescription() {
        return this.description;
    }

    /**
     * @return	the date of the last update 
     */
    public Timestamp getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * @return	the picture url
     */
    public String getPictureUrl() {
        return this.pictureUrl;
    }

    /**
     * @param year
     */
    public void setYear(int year) {
		this.year = year;
    }

    /**
     * @param description
     */
    public void setDescription(JSONObject description) {
        this.description = description;
    }

    /**
     * @param pictureUrl
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

}
