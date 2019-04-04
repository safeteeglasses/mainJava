package com.techelevator.todo.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bouncycastle.util.test.Test;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techelevator.todo.model.Todo;

@Component
public class TodoDao implements ITodoDao {
	
	private Map<Integer,Todo> todos = new HashMap<>();
	
	public TodoDao() throws JsonParseException, JsonMappingException, IOException {
		loadJSON();
	}

	@Override
	public List<Todo> list() {
		List<Todo> allTodos = new ArrayList<>();
		todos.forEach((k,v) -> allTodos.add(v));
		return allTodos;
	}
	
	@Override
	public Todo create(Todo todo) {
		todos.put(todo.getId(), todo);
		return todo;
	}
	
	@Override
	public Todo read(int id) {
		return todos.get(id);
	}
	
	@Override
	public Todo update(Todo todo) {
		todos.put(todo.getId(), todo);
		return todo;
	}
	
	@Override
	public void delete(int id) {
		todos.remove(id);
	}

	private void loadJSON() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		InputStream inputStream = Test.class.getResourceAsStream("/data.json");
		Todo[] jsondata = mapper.readValue(inputStream, Todo[].class);
		for(Todo todo : jsondata) {
			todos.put(todo.getId(),todo);
		}
	}

	
}
