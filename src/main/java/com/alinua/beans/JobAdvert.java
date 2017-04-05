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
     * @param idJobAdvert   the identifier
     * @param title         the title string
     * @param location      the location place
     * @param industry      the related industry
     * @param postDate      the date where this advert has been posted
     * @param description   the description string
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
     * Return the job identifier
     *
     * @return the identifier
     */
    public String getIdJobAdvert() {
        return idJobAdvert;
    }

    /**
     * Define a new identifier for this object
     *
     * @param idJobAdvert   the new identifier
     */
    public void setIdJobAdvert(String idJobAdvert) {
        this.idJobAdvert = idJobAdvert;
    }

    /**
     * Return this object title
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define a new title for this object
     *
     * @param title     the new title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Return this object location
     *
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Define a new location for this object
     *
     * @param location  the new location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Return this object industry
     *
     * @return the industry
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Define a new industry
     *
     * @param industry  the new industry
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * Return the date where this advert has been posted
     *
     * @return the postDate
     */
    public Timestamp getPostDate() {
        return postDate;
    }

    /**
     * Define a new date for the post date
     *
     * @param postDate  the new date
     */
    public void setPostDate(Timestamp postDate) {
        this.postDate = postDate;
    }

    /**
     * Return the description structure
     *
     * This structure is defined as a JSON string
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define this object description structure
     *
     * This structure is defined as a JSON string
     *
     * @param description   the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Return a string which contains object data
     *
     * @return the compute string
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "JobAdvert [idJobAdvert=" + idJobAdvert + ", title=" + title + ", location=" + location + ", industry="
                + industry + ", postDate=" + postDate + ", description=" + description + "]";
    }

}
