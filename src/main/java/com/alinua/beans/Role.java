package com.alinua.beans;

import java.io.Serializable;

/**
 * 
 *  Role of the user on the site.
 * 
 * @author Alice 
 *
 */
public enum Role implements Serializable {
	/**
	 * Alumni : User who can post ads, meeting, ... He can also add projects.
	 */
    alumni,
    
    /**
	 * JobAdvertiser : Recruiter who can only post ads
	 */
    jobAdvertiser
}
