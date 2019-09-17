package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.inti.entities.Seuil;
import com.inti.services.interfaces.ISeuilService;

@RestController
@RequestMapping(value = "/")
public class SeuilController {
	
	@Autowired
	ISeuilService seuilService ;
	
	@RequestMapping(value="/seuils", method = RequestMethod.GET)
	public List<Seuil> findAll() {
		return seuilService.findAll();
	}
	
	@RequestMapping(value="/seuils/{id}", method = RequestMethod.GET)
	public Seuil findById(@PathVariable("id") Long idSeuil) {
		return seuilService.findById(idSeuil);
	}
	
	@RequestMapping(value="/seuils", method = RequestMethod.POST)
	public void save(@RequestBody Seuil seuil) {
		seuilService.save(seuil);
	}
	
	@RequestMapping(value="/seuils/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") long idSeuil) {
		seuilService.delete(idSeuil);
	}
	

}
