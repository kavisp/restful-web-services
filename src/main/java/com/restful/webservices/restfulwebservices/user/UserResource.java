package com.restful.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public User findUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	
	@PostMapping(path = "/users", consumes = "application/json")
	public ResponseEntity saveUser(@RequestBody User user) {
		User savedUSer = service.saveUser(user);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUSer.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

}
