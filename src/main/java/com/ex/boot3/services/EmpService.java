package com.ex.boot3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.boot3.beans.EmpTo;
import com.ex.boot3.dao.EmpDao;
import com.ex.boot3.entities.EmpEntity;

@Service
public class EmpService {
	
	@Autowired
	private EmpDao dao;

	public EmpTo authenticateAndFetch(Integer empId, String password) {
		dao.authenticate(empId, password);
		EmpTo empTo = dao.fetchEmpDeatils(empId);
		return empTo;
	}
    
}
