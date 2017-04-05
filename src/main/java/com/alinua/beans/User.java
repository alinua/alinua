package com.alinua.beans;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Yannick ADECHI
 *
 */
public class User implements Serializable {

    /**
     * Default constructor
     */
    public User(){

    }

    /**
     * Constructor using fields
     *
     * @param email                 the user email
     * @param idLinkedin            the Linkedin identifier
     * @param role                  the user role
     * @param jobAdverts            the user adverts list
     * @param archivedJobAdverts    the user archived advert list
     */
    public User(String email, String idLinkedin, Role role, Vector<JobAdvert> jobAdverts,
            Vector<JobAdvert> archivedJobAdverts) {
        super();
        this.email = email;
        this.idLinkedin = idLinkedin;
        this.role = role;
        this.jobAdverts = jobAdverts;
        this.archivedJobAdverts = archivedJobAdverts;
    }


    /**
     *  The email of the user
     */
    private String email;

    /**
     * The id of the Linkedin's user
     */
    private String idLinkedin;

    /**
     *  The role of the user
     *
     *  @see beans.Role
     */
    private Role role;

    /**
     *  The list of user's job adverts
     *
     *  @see beans.JobAdvert
     */
    private Vector<JobAdvert> jobAdverts;

    /**
     *  The list of job adverts archived by the user
     *
     *  @see beans.JobAdvert
     */
    private Vector<JobAdvert> archivedJobAdverts;


    /// GETTERS n SETTERS
    /**
     * Return the user email
     *
     * The string is formated as <identifier>@<domain>
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define a new email for the user
     *
     * @param email  the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Return the user LinkedIn identifier
     *
     * @return the Linkedin identifier
     */
    public String getIdLinkedin() {
        return idLinkedin;
    }

    /**
     * Define a new LinkedIn identifier for the user
     *
     * @param idLinkedin  the new identifier
     */
    public void setIdLinkedin(String idLinkedin) {
        this.idLinkedin = idLinkedin;
    }

    /**
     * Return user role status in the platform
     *
     * @return the role
     *
     * @see beans.Role
     */
    public Role getRole() {
        return role;
    }

    /**
     * Define a new role status for the user
     *
     * @param role  the new role
     *
     * @see beans.Role
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Return the user job adverts list
     *
     * The adverts are stored in a Vector
     *
     * @return the adverts list
     *
     * @see beans.JobAdvert
     */
    public Vector<JobAdvert> getJobAdverts() {
        return jobAdverts;
    }

    /**
     * Define a new list of job adverts
     *
     * The adverts are stored in a Vector
     *
     * @param jobAdverts  the new adverts list
     *
     * @see beans.JobAdvert
     */
    public void setJobAdverts(Vector<JobAdvert> jobAdverts) {
        this.jobAdverts = jobAdverts;
    }

    /**
     * Return the user archived job adverts list
     *
     * The adverts are stored in a Vector
     *
     * @return the adverts list
     *
     * @see beans.JobAdvert
     */
    public Vector<JobAdvert> getArchivedJobAdverts() {
        return archivedJobAdverts;
    }

    /**
     * Define a new list of archived job adverts
     *
     * The adverts are stored in a Vector
     *
     * @param archivedJobAdverts  the new adverts list
     *
     * @see beans.JobAdvert
     */
    public void setArchivedJobAdverts(Vector<JobAdvert> archivedJobAdverts) {
        this.archivedJobAdverts = archivedJobAdverts;
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
        return "User [email=" + email + ", idLinkedin=" + idLinkedin + ", role=" + role + ", jobAdverts=" + jobAdverts
                + ", archivedJobAdverts=" + archivedJobAdverts + "]";
    }


}
