package com.ex.boot3.beans;

import java.io.Serializable;

public class TaskTo implements Serializable{
	private int id;
	private String taskName;
	private String taskDesc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	@Override
	public String toString() {
		return "TaskEntity [id=" + id + ", taskName=" + taskName + ", taskDesc=" + taskDesc + "]";
	}

}
