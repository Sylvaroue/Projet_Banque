package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.User;
import com.inti.services.interfaces.IUserService;

@RestController
@RequestMapping(value = "/")
public class UserController {

	@Autowired
	IUserService userService ;
	
	@GetMapping(value="users")
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping(value="user/{id}")
	public User findById(@PathVariable("id") Long idUser) {
		return userService.findById(idUser).orElse(null);
	}
	
	@PostMapping(value="user")
	public User save(@RequestBody User user) {
		return userService.save(user);
	}
	
	@DeleteMapping(value="user/{id}")
	public void delete(@PathVariable("id") long idUser) {
		userService.delete(idUser);
	}
}
