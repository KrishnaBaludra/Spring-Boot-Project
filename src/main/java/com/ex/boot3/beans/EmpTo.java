package com.ex.boot3.beans;

import java.io.Serializable;
import java.util.List;

import com.ex.boot3.entities.TaskEntity;

public class EmpTo implements Serializable {
	private int id;
	private String name;
	private String location;
	private Byte age;
	private int managerId;
	private String type;
	List<TaskTo> taskList;

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

	public List<TaskTo> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<TaskTo> taskList) {
		this.taskList = taskList;
	}

	@Override
	public String toString() {
		return "EmpTo [id=" + id + ", name=" + name + ", location=" + location + ", age=" + age + ", managerId="
				+ managerId + ", type=" + type + ", taskList=" + taskList + "]";
	}

}
