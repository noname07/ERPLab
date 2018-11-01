package com.ltlg.erplab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ltlg.erplab.model.User;
import com.ltlg.erplab.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	private UserRepository repository;

	public ResponseEntity<User> Authenticate(User user) {
		for (User u : repository.findAll()) {
			if (u.getName().equals(user.getName()) && u.getPassword().equals(u.getPassword())) {
				return ResponseEntity.ok().build();
			}
		}
		return ResponseEntity.notFound().build();
	}

}