package com.techelevator.todo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.todo.dao.TodoDao;
import com.techelevator.todo.exception.TodoNotFoundException;
import com.techelevator.todo.model.Todo;


@RestController
@CrossOrigin
@RequestMapping("/api/todos")
public class TodoController {
	
	private TodoDao todoDao;
	
	public TodoController(TodoDao todoDao) {
		this.todoDao = todoDao;
	}

	@GetMapping
	public List<Todo> list() {
		return todoDao.list();
	}
	
	@GetMapping("/{id}")
	public Todo read(@PathVariable int id) throws TodoNotFoundException {
		Todo todo = todoDao.read(id);
		if( todo != null ) {
			return todo;
		} else {
			throw new TodoNotFoundException(id,"Todo Not Found!");
		}
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Todo create(@RequestBody Todo todo) {
		return todoDao.create(todo);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Todo update(@RequestBody Todo todo,@PathVariable int id) throws TodoNotFoundException {
		Todo requestedTodo = todoDao.read(id);
		if( requestedTodo != null ) {
			return todoDao.update(todo);
		} else {
			throw new TodoNotFoundException(id,"Todo Not Found!");
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		todoDao.delete(id);
	}
	
}
