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

import com.inti.entities.Seuil;
import com.inti.services.interfaces.ISeuilService;

@RestController
@RequestMapping(value = "/")
public class SeuilController {
	
	@Autowired
	ISeuilService seuilService ;
	
	@GetMapping(value="seuils")
	public List<Seuil> findAll() {
		return seuilService.findAll();
	}
	
	@GetMapping(value="seuil/{id}")
	public Seuil findById(@PathVariable("id") Long idSeuil) {
		return seuilService.findById(idSeuil).orElse(null);
	}
	
	@PostMapping(value="seuil")
	public Seuil save(@RequestBody Seuil seuil) {
		return seuilService.save(seuil);
	}
	
	@DeleteMapping(value="seuil/{id}")
	public void delete(@PathVariable("id") long idSeuil) {
		seuilService.delete(idSeuil);
	}
	

}
