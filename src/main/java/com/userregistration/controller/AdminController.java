package com.userregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.userregistration.model.User;
import com.userregistration.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> listAllUsers() {
		return null;
	}

	@DeleteMapping("/deluser/{id}")
	public ResponseEntity<HttpStatus> deleteUserById(@PathVariable("id") int id) {
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}
