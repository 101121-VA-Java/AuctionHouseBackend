package com.spacecats.AuctionHouse.Controllers;

import javax.validation.Valid;

import com.spacecats.AuctionHouse.Models.User;
import com.spacecats.AuctionHouse.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

	private UserService us;
	
	@Autowired
	public AuthController(UserService us) {
		this.us = us;
	}
	
	@PostMapping
	public ResponseEntity<String> login(@Valid @RequestBody User user){
		String token = us.login(user);
		if(token != null) return new ResponseEntity<>(token, HttpStatus.CREATED);
		else return new ResponseEntity<>("Wrong username and or password", HttpStatus.BAD_REQUEST);
	}
}