package com.alinua.dao.impl;

import java.util.Vector;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.alinua.beans.User;
import com.alinua.dao.UserDAO;

/**
  *  Implementation of DAO User class
  *  
  *  @author AutoGenerate
  *  @version 1.0
  **/
public class UserDaoImpl implements UserDAO {

	private SessionFactory sessionFactory;
	
	/**
         *  Default constructor
         *  Update of current session
         */
	public UserDaoImpl(SessionFactory session) {
		this.sessionFactory = session;
	}
	
	/**
         *  Save of user from current session
         *   
	 *  @param {User} User - User of current session
	 *  @return {boolean} True or null
         */
	@Override
	public boolean save(User user) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.saveOrUpdate(user);
		trans.commit();
		session.close();
		return true;
	}

	/**
         *  Update of user from current session
         *   
	 *  @param {User} User - User of current session
	 *  @return {boolean} True or null
         */
	@Override
	public boolean update(User user) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(user);
		trans.commit();
		session.close();
		return true;
	}

	/**
         *  Remove of user from current session
         *   
	 *  @param {User} User - User of current session
	 *  @return {boolean} True or null
         */
	@Override
	public boolean remove(User user) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.delete(user);
		trans.commit();
		session.close();
		return true;
	}

	/**
         *  Getter of users from current session
         *  Auto-generated method
	 *
	 *  @return {Vector<User>} null
         */
	@Override
	public Vector<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
