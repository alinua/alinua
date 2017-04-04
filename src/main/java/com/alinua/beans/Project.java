package com.alinua.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Vector;

/**
 * <p> A project can be created by an Alumni. 
 *  A project instance contains standard informations such as: </p>
 * <ul>
 * 	<li> a name/headline
 *	<li> a start and an end date (if the project is terminated)
 * 	<li> a GitHub repo url of this project (optional)
 *	<li> a single string which represents the project topics, they are
 *	delimited by coma (ex: topic1,topic2)
 *  <li> a set of members 
 *  <li> a description (such as aim of the project, improved skills)
 * <ul>
 *	
 * @author Mariam Bouzid 
 */
public class Project implements Serializable {
	/**
     * Default constructor
	 * Useful for test.
	 *
     */
    public Project() {
		this.name = new String("Sans titre 1");
		this.start = new Timestamp (0);
		this.end = new Timestamp (1000);
		this.githubUrl = new String("github.com/alinua/alinua");
		this.topics = new String ("web,jee");
		this.members = new Vector<User> ();
		this.description = new String ("a complete failure :(");
    }


    /**
	 * Constructor
	 *
     * @param name 
     * @param start 
     * @param end 
     * @param gitHub 
     * @param topics
	 *
     */
    public Project(String name, Timestamp start, Timestamp end, String githubUrl, String topics) {
		this.name = name;
		this.start = start;	
		this.end = end;
		this.githubUrl = githubUrl;
		this.topics = topics;
		this.members = new Vector <User> ();
        
    }


    /**
     * The name of the project
	 *
     */
    private String name;

    /**
     * The date of the start of the project
	 *
     */
    private Timestamp start;

    /**
     * The date of the end of the project
	 *
     */
    private Timestamp end;

    /**
     * The GitHub url of the correponding repo (optional) 
	 * for instance: 'github.com/alinua/alinua'
	 *
     */
    private String githubUrl;

    /**
     * The topics reached by the project,
	 * they are represented by a single string (delimited by
	 * a coma)
	 * For instance: web, jee
	 *
     */
    private String topics;

    /**
     * The members working in the project
	 *
     */
    private Vector <User> members;

    /**
     * A description of the project
	 * 
     */
    private String description;


    /**
     * @return	the name of the project
	 *
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return	the start date
     */
    public Timestamp getStart() {
        return this.start;
    }

    /**
     * @return	the end date
     */
    public Timestamp getEnd() {
        return this.end;
    }

    /**
     * @return	the github url
     */
    public String getGithubUrl() {
        return this.githubUrl;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param start
     */
    public void setStart(Timestamp start) {
        this.start = start;
    }

    /**
     * @param end
     */
    public void setEnd(Timestamp end) {
        this.end = end;
    }

    /**
     * @param url
     */
    public void setUrl(String gitHubUrl) {
        this.githubUrl = gitHubUrl;
    }

    /**
     * @param topics
     */
    public void setTopics(String topics) {
        this.topics = topics;
    }

    /**
     * @return the string representation
     */
    public String toString() {
        // TODO implement here
        return "";
    }

    /**
     * @return the members of the project
     */
    public Vector<User> getMembers() {
        return this.members;
    }

    /**
     * @return the topics
     */
    public String getTopics() {
        return this.topics;
    }

    /**
     * @return	the description of this project
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
       	this.description = description;
    }
}
