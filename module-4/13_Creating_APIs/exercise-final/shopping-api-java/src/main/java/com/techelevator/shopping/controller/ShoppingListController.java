package com.techelevator.shopping.controller;

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

import com.techelevator.shopping.dao.ItemDao;
import com.techelevator.shopping.exception.ItemNotFoundException;
import com.techelevator.shopping.model.Item;


@RestController
@CrossOrigin
@RequestMapping("/api/groceries")
public class ShoppingListController {
	
	private ItemDao itemDao;
	
	public ShoppingListController(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	@GetMapping
	public List<Item> list() {
		return itemDao.list();
	}
	
	@GetMapping("/{id}")
	public Item read(@PathVariable int id) throws ItemNotFoundException {
		Item item = itemDao.read(id);
		if( item != null ) {
			return item;
		} else {
			throw new ItemNotFoundException(id,"Item Not Found!");
		}
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Item create(@RequestBody Item item) {
		return itemDao.create(item);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Item update(@RequestBody Item Item,@PathVariable int id) throws ItemNotFoundException {
		Item requestedItem = itemDao.read(id);
		if( requestedItem != null ) {
			return itemDao.update(Item);
		} else {
			throw new ItemNotFoundException(id,"Item Not Found!");
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		itemDao.delete(id);
	}
	
}