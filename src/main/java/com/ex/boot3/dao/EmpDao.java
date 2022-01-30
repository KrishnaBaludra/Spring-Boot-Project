package com.ex.boot3.dao;

import com.ex.boot3.beans.EmpTo;

public interface EmpDao {

	void authenticate(Integer userName, String password);

	EmpTo fetchEmpDeatils(Integer empId);
	
}
