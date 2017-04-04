package com.alinua.dao.impl;

import java.util.Vector;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.alinua.beans.User;
import com.alinua.dao.UserDAO;

public class UserDaoImpl implements UserDAO {

	private SessionFactory sessionFactory;
	
	public UserDaoImpl(SessionFactory session) {
		this.sessionFactory = session;
	}
	
	@Override
	public boolean save(User user) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.saveOrUpdate(user);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	public boolean update(User user) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(user);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	public boolean remove(User user) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.delete(user);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	public Vector<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
