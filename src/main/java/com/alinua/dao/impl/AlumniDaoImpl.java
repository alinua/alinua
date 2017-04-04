package com.alinua.dao.impl;

import java.util.Vector;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.alinua.beans.Alumni;
import com.alinua.dao.AlumniDAO;

public class AlumniDaoImpl implements AlumniDAO {

	private SessionFactory sessionFactory;
	
	public AlumniDaoImpl(SessionFactory session) {
		this.sessionFactory = session;
	}
	
	@Override
	public boolean save(Alumni alumni) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.saveOrUpdate(alumni);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	public boolean update(Alumni alumni) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(alumni);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	public boolean remove(Alumni alumni) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.delete(alumni);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	public Vector<Alumni> getAlumnis() {
		// TODO Auto-generated method stub
		return null;
	}

}
