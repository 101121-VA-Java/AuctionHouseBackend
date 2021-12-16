package com.spacecats.AuctionHouse.Controllers;

import java.util.List;

import javax.validation.Valid;

import com.spacecats.AuctionHouse.Models.User;
import com.spacecats.AuctionHouse.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

	private UserService us;
	
	@Autowired
	public UserController(UserService us) {
		this.us = us;
	}

	@GetMapping
	public List<User> get(){
		return us.getAllUsers();
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id")int id) {
		return new ResponseEntity<>(us.getUserById(id), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id")int id, @Valid @RequestBody User user){
		User u = us.update(user, id);
		return new ResponseEntity<>(u, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<String> register(@Valid @RequestBody User user){
		String token = us.createUser(user);
		return new ResponseEntity<>(token, HttpStatus.CREATED);
	}
}