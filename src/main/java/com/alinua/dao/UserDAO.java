package com.alinua.dao;

import java.util.Vector;

import com.alinua.beans.User;

public interface UserDAO {

	public boolean save(User user);
	public boolean update(User user);
	public boolean remove(User user);
	public Vector<User> getUsers();
}
