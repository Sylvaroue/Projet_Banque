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

import com.inti.entities.Employe;
import com.inti.services.interfaces.IEmployeService;

@RestController
@RequestMapping(value = "/")
public class EmployeController {
	
	@Autowired
	IEmployeService employeService ;
	
	@GetMapping(value="employes")
	public List<Employe> findAll() {
		return employeService.findAll();
	}
	
	@GetMapping(value="employe/{id}")
	public Employe findById(@PathVariable("id") Long idEmploye) {
		return employeService.findById(idEmploye).orElse(null);
	}
	
	@PostMapping(value="employe")
	public Employe save(@RequestBody Employe employe) {
		return employeService.save(employe);
	}
	
	@DeleteMapping(value="employe/{id}")
	public void delete(@PathVariable("id") long idEmploye) {
		employeService.delete(idEmploye);
	}

}
