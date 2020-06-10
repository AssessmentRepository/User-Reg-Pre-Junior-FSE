package com.userregistration.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.userregistration.model.User;
import com.userregistration.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping(value = "/signup")
	public String saveUser(@ModelAttribute("signup") @Valid @RequestBody User user, Model model) {
		return "signup";
	}
	
	@GetMapping("/get/{id}")
	public String getUserById(@PathVariable("id") int userId) {
		return "login";
	}

	@GetMapping("/put/{id}")
	public String updateUserById(@PathVariable("id") int userId) {
		return "userform";
	}
}
