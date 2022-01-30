package com.ex.boot3.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.ex.boot3.beans.EmpTo;
import com.ex.boot3.beans.TaskTo;
import com.ex.boot3.entities.EmpEntity;
import com.ex.boot3.entities.TaskEntity;
import com.ex.boot3.exceptions.InvalidUserCredentialsException;
import com.ex.boot3.utility.DBUtility;

@Repository
public class EmpDaoImpl implements EmpDao {

	@Override
	public void authenticate(Integer empId, String password) {
		SessionFactory sf = DBUtility.getSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from EmpEntity where id=:id and password=:password");
		query.setInteger("id", empId);
		query.setString("password", password);
		if(query.list().isEmpty()) {
			throw new InvalidUserCredentialsException("Invalid id or password");
		}
	}

	@Override
	public EmpTo fetchEmpDeatils(Integer empId) {
		SessionFactory sf = DBUtility.getSessionFactory();
		Session session = sf.openSession();
		EmpEntity entity = session.get(EmpEntity.class, empId);
		System.out.println("entity::"+entity);
		EmpTo empTo = new EmpTo();
	   
		BeanUtils.copyProperties(entity, empTo);
		List<TaskTo> taskToList = new ArrayList<>();
		for(TaskEntity te : entity.getTaskList()) {
			TaskTo to = new TaskTo();
			BeanUtils.copyProperties(te, to);
			taskToList.add(to);
		}
		empTo.setTaskList(taskToList);
		
		System.out.println("empTo::"+empTo);
		
		return empTo;
	}
}
