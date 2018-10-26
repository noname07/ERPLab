package com.ltlg.erplab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ltlg.erplab.model.User;
import com.ltlg.erplab.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService service;

//    @RequestMapping("/resgistrarse")
//    @ResponseBody
//    public Long register(@RequestBody User usuario) {
//        return service.registerUser(usuario);
//    }
    
    @GetMapping("/resgistrarse/{id}")
	public ResponseEntity<User> get(@RequestParam("id") int id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/resgistrarse", method = RequestMethod.GET)
	public ResponseEntity<List<User>> all() {
		return service.all();
	}

	@PostMapping(value = "/registrarse")
	public ResponseEntity<User> add(@RequestBody User entity) {
		return service.add(entity);
	}

	@DeleteMapping("/registrarse")
	public ResponseEntity<User> remove(@RequestParam("id") int id) {
		return service.remove(id);
	}

	@PutMapping("/registrarse")
	public ResponseEntity<User> update(@RequestBody User entity) {
		return service.update(entity);
	}
}
