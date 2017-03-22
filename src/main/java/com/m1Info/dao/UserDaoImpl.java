package com.m1Info.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.m1Info.bean.User;

import javax.persistence.Query;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	
	
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
		
	}


	public User getUser(int id) {
		// TODO Auto-generated method stub7
		User user=(User) getHibernateTemplate().get(User.class, new Integer(id));
		return user;
	}

}
