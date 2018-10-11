package com.ltlg.erplab.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ltlg.erplab.model.User;
import com.ltlg.erplab.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService userService;
	
	@PostMapping("/login")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void login(@RequestBody User user) {
		userService.Authenticate(user);
	}

	@GetMapping("/logout")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void logout(HttpSession session) {
		session.invalidate();
	}

}
