package com.techelevator.todo.model;

public class Todo {

    private int id;
    private String task;
    private boolean completed;
    
    public Todo() {
    	
    }
    
	public Todo(int id, String task, boolean completed) {
		super();
		this.id = id;
		this.task = task;
		this.completed = completed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", task=" + task + ", completed=" + completed + "]";
	}

}