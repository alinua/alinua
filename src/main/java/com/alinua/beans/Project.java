package com.alinua.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Vector;

/**
 * <p> A project can be created by an Alumni.
 *  A project instance contains standard informations such as: </p>
 * <ul>
 *  <li> a name/headline
 *  <li> a start and an end date (if the project is terminated)
 *  <li> a GitHub repo url of this project (optional)
 *  <li> a single string which represents the project topics, they are
 *  delimited by coma (ex: topic1,topic2)
 *  <li> a set of members
 *  <li> a description (such as aim of the project, improved skills)
 * <ul>
 *
 * @author Mariam Bouzid
 */
public class Project implements Serializable {
    /**
     * Default constructor
     *
     * This constructor must only be used for testing
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
     * @param name      the project name
     * @param start     the date when the project started
     * @param end       the date when the project has been terminated
     * @param gitHub    the Github repository URL
     * @param topics    the projet tags
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
     */
    private String name;

    /**
     * The date of the start of the project
     */
    private Timestamp start;

    /**
     * The date of the end of the project
     */
    private Timestamp end;

    /**
     * The GitHub url of the correponding repo (optional)
     *
     * for instance: 'github.com/alinua/alinua'
     */
    private String githubUrl;

    /**
     * The topics reached by the project, they are represented by a single
     * string (delimited by a comma)
     *
     * For instance: web, jee
     */
    private String topics;

    /**
     * The members working in the project
     *
     * The members are stored in a Vector
     */
    private Vector <User> members;

    /**
     * A description of the project
     */
    private String description;


    /**
     * Return the project name
     *
     * @return  the name of the project
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the project started date
     *
     * @return  the start date
     */
    public Timestamp getStart() {
        return this.start;
    }

    /**
     * Return the project terminated date
     *
     * @return  the end date
     */
    public Timestamp getEnd() {
        return this.end;
    }

    /**
     * Return the Github repository URL
     *
     * This URL is a relative path which not contains protocol
     *
     * @return  the github url
     */
    public String getGithubUrl() {
        return this.githubUrl;
    }

    /**
     * Define a new name for this project
     *
     * @param name      the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Define a new date for the started date
     *
     * @param start     the new date
     */
    public void setStart(Timestamp start) {
        this.start = start;
    }

    /**
     * Define a new date for the terminated date
     *
     * @param end       the new date
     */
    public void setEnd(Timestamp end) {
        this.end = end;
    }

    /**
     * Define a new URL for the Github repository
     *
     * @param url       the new URL
     */
    public void setUrl(String gitHubUrl) {
        this.githubUrl = gitHubUrl;
    }

    /**
     * Define new topics for this project
     *
     * Topics are stored in a String and separated by comma
     *
     * @param topics    the new topics
     */
    public void setTopics(String topics) {
        this.topics = topics;
    }

    /**
     * Return a string which contains object data
     *
     * @return the string representation
     */
    public String toString() {
        // TODO implement here
        return "";
    }

    /**
     * Return members which works on the project
     *
     * @return the members list
     *
     * @see util.Vector
     * @see beans.User
     */
    public Vector<User> getMembers() {
        return this.members;
    }

    /**
     * Return the project topics
     *
     * Topics are stored in a String and separated by comma
     *
     * @return the topics
     */
    public String getTopics() {
        return this.topics;
    }

    /**
     * Return the project description
     *
     * @return  the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Define a new description for this project
     *
     * @param description   the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
