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

import com.inti.entities.Role;
import com.inti.services.interfaces.IRoleService;

@RestController
@RequestMapping(value = "/")
public class RoleController {

	
	@Autowired
	IRoleService roleService ;
	
	@GetMapping(value="roles")
	public List<Role> findAll() {
		return roleService.findAll();
	}
	
	@GetMapping(value="role/{id}")
	public Role findById(@PathVariable("id") Long idRole) {
		return roleService.findById(idRole).orElse(null);
	}
	
	@PostMapping(value="role")
	public Role save(@RequestBody Role role) {
		return roleService.save(role);
	}
	
	@DeleteMapping(value="role/{id}")
	public void delete(@PathVariable("id") long idRole) {
		roleService.delete(idRole);
	}
}
