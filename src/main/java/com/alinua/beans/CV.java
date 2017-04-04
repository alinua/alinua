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

    
    public CV(JSONObject description, Timestamp lastUpdated){
        this.description = description;
        this.lastUpdated = lastUpdated;
    }

    /**
    * JSon format from linkedin
    *    {
    *      "firstName": "Frodo",
    *      "headline": "Jewelery Repossession in Middle Earth",
    *      "id": "1R2RtA",
    *      "lastName": "Baggins",
    *      "siteStandardProfileRequest": {
    *        "url": "https://www.linkedin.com/profile/view?id=…"
    *      }
    *    }
    */
    private JSONObject description;

    /**
     * Correspond à la dernière MAJ du CV
     */
    private Timestamp lastUpdated;


    /**
     * @return l'attribut description de la classe
     */
    public JSONObject getDescription() {
        return description;
    }

    /**
     * @return l'attribut lastUpdated de la classe
     */
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    /**
     * @param description change la valeur de l'attribut description
     */
    public void setDescription(JSONObject description) {
        this.description = description;
    }

    /**
     * @param lastUpdated change la valeur de l'attribut lastUpdated
     */
    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
}
