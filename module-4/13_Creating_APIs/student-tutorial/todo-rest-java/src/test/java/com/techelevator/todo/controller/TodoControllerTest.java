package com.techelevator.todo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/springmvc-servlet.xml")
public class TodoControllerTest {
	
	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void test_mapping_not_found() throws Exception {
		this.mockMvc.perform(get("/api/todos/foo/bar"))
			.andExpect(status().isNotFound());
	}
	
	@Test
	public void test_list_todos() throws Exception {
		this.mockMvc.perform(get("/api/todos").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
		  .andExpect(status().isOk())
		  .andExpect(content().contentType("application/json;charset=UTF-8"))
		  .andExpect(jsonPath("$.[0].id").value("1"))
		  .andExpect(jsonPath("$.length()").value(4))
		  .andDo(print());
	}
	
	@Test
	public void test_that_valid_todo_is_found() throws Exception {
		this.mockMvc.perform(get("/api/todos/1").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk());
	}
	
	@Test
	public void test_that_invalid_todo_is_not_found() throws Exception {
		this.mockMvc.perform(get("/api/todos/999").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isNotFound());
	}
	
	@Test
	public void test_create_invalid_body_bad_request() throws Exception {
		this.mockMvc.perform(post("/api/todos").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
			.andExpect(status().isBadRequest());
	}
	
	@Test
	public void test_create_with_valid_body_is_created() throws Exception {
		this.mockMvc.perform(post("/api/todos")
				.contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
				.content("{\"id\": 176,\"task\": \"Random Task\",\"completed\": true}"))
				.andExpect(status().isCreated());
	}
	
	@Test
	public void test_put_method_not_allowed() throws Exception {
		this.mockMvc.perform(put("/api/todos").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
			.andExpect(status().isMethodNotAllowed());
	}
	
	@Test
	public void test_update_invalid_body_bad_request() throws Exception {
		this.mockMvc.perform(put("/api/todos/1").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
			.andExpect(status().isBadRequest());
	}
	
	@Test
	public void test_delete_with_valid_id_success() throws Exception {
		this.mockMvc.perform(delete("/api/todos/4"))
			.andExpect(status().isOk());
		
	}
}
