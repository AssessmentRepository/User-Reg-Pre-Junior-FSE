package com.userregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.userregistration.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/list")
	public String listUsers(Model theModel) {
		return "listuser";
	}

	@GetMapping("/deluser/{id}")
	public String deleteUserById(@RequestParam("id") int id) {
		return "redirect:/admin/list";
	}
}
