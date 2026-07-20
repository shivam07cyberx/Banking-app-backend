package com.bank.cash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.cash.entity.User;
import com.bank.cash.service.UserServiceImp;

@RestController
@RequestMapping("/user")
public class Controller {
	
	@Autowired
	UserServiceImp userService;
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User user){
		
		
		
		userService.add(user);
		
		return ResponseEntity.ok(user);		
		
	}
	
	

}
