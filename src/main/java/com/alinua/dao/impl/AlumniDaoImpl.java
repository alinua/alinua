package com.alinua.dao.impl;

import java.util.Vector;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.alinua.beans.Alumni;
import com.alinua.dao.AlumniDAO;


/**
 * 
 *  DAO of the Alumni Impl
 * 
 * @author Sullivan 
 *
 */
public class AlumniDaoImpl implements AlumniDAO {
	/**
	* SessionFactory variable imported from hibernate
	**/
	private SessionFactory sessionFactory;
	
	/**
	* Take a SessionFactory as parameter and affect to the sessionFactory variable the parameter value 
	*  
	*  @param SessionFactory 
	*  
	* @return Put in the sessionFactory variable the value of the Session in parameters
	**/
	public AlumniDaoImpl(SessionFactory session) {
		/**
		* affect the session value to the sessionfactory
		**/
		this.sessionFactory = session;
	}
	
	@Override
	/**
	* Take a Alumni as parameter and return true after saving or updating the alumni
	*  
	* @param alumni 
	*  
	* @return return true after the save or update commit of the alumni
	**/
	public boolean save(Alumni alumni) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.saveOrUpdate(alumni);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	/**
	* Take a Alumni as parameter and return true after updating the alumni
	*  
	* @param alumni 
	*  
	* @return return true after the update commit of the alumni
	**/
	public boolean update(Alumni alumni) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(alumni);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	/**
	* Take a Alumni as parameter and return true after removing the alumni
	*  
	* @param alumni 
	*  
	* @return return true after the remove commit of the alumni
	**/
	public boolean remove(Alumni alumni) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.delete(alumni);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	/**
	* Return a Vector of all the Alumni
	
	  @return null not implemented
	**/
	public Vector<Alumni> getAlumnis() {
		// TODO Auto-generated method stub
		return null;
	}

}
