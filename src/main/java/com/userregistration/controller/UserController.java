package com.userregistration.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.userregistration.model.User;
import com.userregistration.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/signup")
	public ResponseEntity<User> saveUser(@Valid @RequestBody User user, BindingResult result, Model model) {
		// Code
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int userId) {
		return null;
	}

	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUserById(@PathVariable("id") int id, @Valid @RequestBody User user) {
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
