package com.alinua.dao;

import java.util.Vector;

import com.alinua.beans.CV;

public interface CVDAO {

	public boolean save(CV cv);
	public boolean update(CV cv);
	public boolean remove(CV cv);
	public Vector<CV> getCVs();
}
