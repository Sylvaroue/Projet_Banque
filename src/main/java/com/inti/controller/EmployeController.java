package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Employe;
import com.inti.services.interfaces.IEmployeService;



@RestController
@RequestMapping(value = "/")
public class EmployeController {
	
	@Autowired
	IEmployeService employeService ;
	
	@RequestMapping(value="/employes", method = RequestMethod.GET)
	public List<Employe> findAll() {
		return employeService.findAll();
	}
	
	@RequestMapping(value="/employes/{id}", method = RequestMethod.GET)
	public Employe findById(@PathVariable("id") Long idEmploye) {
		return employeService.findById(idEmploye);
	}
	
	@RequestMapping(value="/employes", method = RequestMethod.POST)
	public void save(@RequestBody Employe employe) {
		employeService.save(employe);
	}
	
	@RequestMapping(value="/employes/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") long idEmploye) {
		employeService.delete(idEmploye);
	}
	

}
