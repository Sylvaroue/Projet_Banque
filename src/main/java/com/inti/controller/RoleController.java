package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Role;
import com.inti.services.interfaces.IRoleService;



@RestController
@RequestMapping(value = "/")
public class RoleController {

	
	@Autowired
	IRoleService roleService ;
	
	@RequestMapping(value="/roles", method = RequestMethod.GET)
	public List<Role> findAll() {
		return roleService.findAll();
	}
	
	@RequestMapping(value="/roles/{id}", method = RequestMethod.GET)
	public Role findById(@PathVariable("id") Long idRole) {
		return roleService.findById(idRole);
	}
	
	@RequestMapping(value="/roles", method = RequestMethod.POST)
	public void save(@RequestBody Role role) {
		roleService.save(role);
	}
	
	@RequestMapping(value="/roles/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") long idRole) {
		roleService.delete(idRole);
	}
}
