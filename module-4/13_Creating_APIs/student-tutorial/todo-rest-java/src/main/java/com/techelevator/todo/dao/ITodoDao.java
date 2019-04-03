package com.techelevator.todo.dao;

import java.util.List;

import com.techelevator.todo.model.Todo;

public interface ITodoDao {
	
	public List<Todo> list();
	
	public Todo create(Todo todo);
	
	public Todo read(int id);

	public Todo update(Todo todo);
	
	public void delete(int id);
}
