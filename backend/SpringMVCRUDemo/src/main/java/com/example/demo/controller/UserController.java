package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	UserRepository userRespository;
	
	//saved a new user - CREATE 
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User user){
		try {
			User _user = userRespository.save(new User(user.getUsername() ,user.getPassword()));
			return new ResponseEntity<>(_user, HttpStatus.CREATED);
		}catch(Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}
	
	@PostMapping("/validate")
	public boolean validateUser(@RequestBody User user){
		//based on username and password recieved in request body
		//find the same in a db 
		// once record is found return user is valid
		//else return user is invalid
		boolean userFound = false;
		if(userFound) {
			return userFound;
		}else {
			return userFound;
		}
	}
	//get all users - READ
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers(){
		try {
			List<User> users = new ArrayList<User>();
			userRespository.findAll().forEach(users::add);
			if(users.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(users, HttpStatus.OK);
		}catch(Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
//	Get User By Id - READ
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") long id){
		try {			
			Optional<User> userData = userRespository.findById(id);			
			if(userData.isPresent()) {
				return new ResponseEntity<>(userData.get(), HttpStatus.OK);
			}else {
				return new ResponseEntity<>( HttpStatus.NOT_FOUND);
			}			
		}catch(Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}	
	
//Update User By Id - UPDATE
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") long id,@RequestBody User user){
		Optional<User> userData = userRespository.findById(id);		
		if(userData.isPresent()) {
			 User _user = userData.get();
			_user.setUsername(user.getUsername());
			_user.setPassword(user.getPassword());
			return new ResponseEntity<>(userRespository.save(_user), HttpStatus.OK);
		}else {
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		}
	}
	
	
//Delete User By Id - DELETE
	@DeleteMapping("/user/{id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") long id){
		try {
			userRespository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}catch(Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
