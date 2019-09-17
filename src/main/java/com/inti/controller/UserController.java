package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.User;



@RestController
@RequestMapping(value = "/")
public class UserController {

	
	@Autowired
	IUserService userService ;
	
	@RequestMapping(value="/users", method = RequestMethod.GET)
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@RequestMapping(value="/users/{id}", method = RequestMethod.GET)
	public User findById(@PathVariable("id") Long idUser) {
		return userService.findById(idUser);
	}
	
	@RequestMapping(value="/users", method = RequestMethod.POST)
	public void save(@RequestBody User user) {
		userService.save(user);
	}
	
	@RequestMapping(value="/users/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") long idUser) {
		userService.delete(idUser);
	}
}
