package com.ibs.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.project.entity.Employee;
import com.ibs.project.model.LoginModel;
import com.ibs.project.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginservice;

	@CrossOrigin
	@PostMapping("/user")
	public LoginModel validateUser(@RequestBody Employee employee){
		return loginservice.validateUser(employee);
	
	}

}