package com.techelevator.todo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class TodoNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6974644855556556894L;
	
	private int todoId;
	
	public TodoNotFoundException(int id, String message) {
		super(message);
		setTodoId(id);
	}

	public int getTodoId() {
		return todoId;
	}

	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}

}
