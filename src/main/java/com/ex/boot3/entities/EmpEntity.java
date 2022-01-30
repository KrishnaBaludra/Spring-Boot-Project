package com.ex.boot3.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_TB")
public class EmpEntity {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String password;
	private String location;
	private Byte age;
	private int managerId;
	private String type;
	@OneToMany
	List<TaskEntity> taskList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Byte getAge() {
		return age;
	}

	public void setAge(Byte age) {
		this.age = age;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<TaskEntity> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<TaskEntity> taskList) {
		this.taskList = taskList;
	}

	@Override
	public String toString() {
		return "EmpEntity [id=" + id + ", name=" + name + ", password=" + password + ", location=" + location + ", age="
				+ age + ", managerId=" + managerId + ", type=" + type + ", taskList=" + taskList + "]";
	}
}
