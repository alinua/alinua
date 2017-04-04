package com.alinua.dao;

import java.util.Vector;
import com.alinua.beans.Alumni;

public interface AlumniDAO {

	public boolean save(Alumni alumni);
	public boolean update(Alumni alumni);
	public boolean remove(Alumni alumni);
	public Vector<Alumni> getAlumnis();
}
