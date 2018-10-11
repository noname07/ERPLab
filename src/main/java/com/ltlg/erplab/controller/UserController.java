package com.ltlg.erplab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ltlg.erplab.model.User;
import com.ltlg.erplab.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/user/{id}")
	public ResponseEntity<User> get(@RequestParam("id") int id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/usuarios", method = RequestMethod.GET)
	public ResponseEntity<List<User>> all() {
		return service.all();
	}

	@PostMapping(value = "/usuarios")
	public ResponseEntity<User> add(@RequestBody User entity) {
		return service.add(entity);
	}

	@DeleteMapping("/usuarios")
	public ResponseEntity<User> remove(@RequestParam("id") int id) {
		return service.remove(id);
	}

	@PutMapping("/usuarios")
	public ResponseEntity<User> update(@RequestBody User entity) {
		return service.update(entity);
	}
}
