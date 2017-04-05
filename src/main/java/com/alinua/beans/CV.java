package com.alinua.beans;

import java.io.Serializable;
import java.sql.Timestamp;

import org.json.simple.JSONObject;

/**
 *
 * @author Thibault
 *
 */
public class CV implements Serializable {

    /**
     * Default constructor
     */
    public CV() {
    }

    /**
     * Constructor
     *
     * @param description   the description structure which contains CV data
     * @param lastUpdated   the last time this object has been updated
     */
    public CV(JSONObject description, Timestamp lastUpdated){
        this.description = description;
        this.lastUpdated = lastUpdated;
    }

    /**
    * Description structure retrieved from LinkedIn
    *
    * This description is structured as a JSON string. This is an example of
    * retrieved data:
    *
    * <code>
    *    {
    *      "firstName": "Frodo",
    *      "headline": "Jewelery Repossession in Middle Earth",
    *      "id": "1R2RtA",
    *      "lastName": "Baggins",
    *      "siteStandardProfileRequest": {
    *        "url": "https://www.linkedin.com/profile/view?id=…"
    *      }
    *    }
    * </code>
    */
    private JSONObject description;

    /**
     * The last time this object has been updated
     */
    private Timestamp lastUpdated;


    /**
     * Return description as JSON structure
     *
     * @return the JSON string
     */
    public JSONObject getDescription() {
        return description;
    }

    /**
     * Return the last update date
     *
     * This timestamp is the last time where this object has been updated
     *
     * @return the date of the last update
     */
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Define a new description structure
     *
     * @param description   the new description structure
     */
    public void setDescription(JSONObject description) {
        this.description = description;
    }

    /**
     * Define the last updated date
     *
     * @param lastUpdated   the new date
     */
    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
