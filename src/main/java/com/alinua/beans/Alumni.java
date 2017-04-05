package com.alinua.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Vector;

import org.json.simple.JSONObject;

/**
 * <p> An Alumni possess the role 'alumni', thus : </p>
 * <ul>
 *  <li> he can create/read/update/archive all kind of adverts (jobadvert,announcement).
 *  <li> he can create/read/update projects
 *  <li> he can export his CV into XML, ODT, PDF
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
     *
     * This constructor must only be used for testing
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
     * @param year          the schoolyear (as yyyy)
     * @param description   the JSON description retrieved from LinkedIn
     * @param lastUpdated   the update date related to the CV retrieving
     * @param pictureUrl    the picture url
     */
    public Alumni(int year, JSONObject description, Timestamp lastUpdated, String pictureUrl ) {
        this.year = year;
        this.description = description;
        this.lastUpdated = lastUpdated;
        this.pictureUrl = pictureUrl;
    }

    /**
     * Represents the school year (as yyyy)
     */
    private int year;

    /**
     * Description structure retrieved from LinkedIn
     *
     * This description is structured as a JSON string. This is an example of
     * retrieved data:
     *
     * <code>
     *  {
     *      "firstName": "Jean-Kévin",
     *      "lastName": "Dupont"
     *      "birthDate": "11/09/2001",
     *      "location": "Angers,France"
     *  }
     * </code>
     */
    private JSONObject description;

    /**
     * The last time the Alumni object has been updated
     */
    private Timestamp lastUpdated;

    /**
     * This is the picture url, represented as a String
     */
    private String pictureUrl;

    /**
     * Represents the User object directly linked to this Alumni
     *
     * @see alinua.beans.User
     */
    private User user;

    /**
     * Represents the Alumni object projects
     *
     * The projects are stored in a Vector
     *
     * @see util.Vector
     * @see alinua.beans.Project
     */
    private Vector<Project> projects;

    /**
     * Represent the Alumni object CV
     *
     * @see alinua.beans.CV
     */
    private CV cv;

    /**
     * Return Alumni year attribute
     *
     * @return the year (as yyyy)
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Return description as JSON structure
     *
     * @return the JSON string
     */
    public JSONObject getDescription() {
        return this.description;
    }

    /**
     * Return the last update date
     *
     * This timestamp is the last time where this object has been updated
     *
     * @return the date of the last update
     */
    public Timestamp getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Return the picture URL
     *
     * @return the picture url
     */
    public String getPictureUrl() {
        return this.pictureUrl;
    }

    /**
     * Define a new year value for this object
     *
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Define a new description structure for this object
     *
     * @param description
     */
    public void setDescription(JSONObject description) {
        this.description = description;
    }

    /**
     * Define a new picture URL for this object
     *
     * @param pictureUrl
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

}
