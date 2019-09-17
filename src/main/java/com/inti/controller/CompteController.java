package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Compte;



@RestController
@RequestMapping(value = "/")
public class CompteController {

	
	@Autowired
	ICompteService compteService ;
	
	@RequestMapping(value="/comptes", method = RequestMethod.GET)
	public List<Compte> findAll() {
		return compteService.findAll();
	}
	
	@RequestMapping(value="/comptes/{id}", method = RequestMethod.GET)
	public Compte findById(@PathVariable("id") Long idCompte) {
		return compteService.findById(idCompte);
	}
	
	@RequestMapping(value="/comptes", method = RequestMethod.POST)
	public void save(@RequestBody Compte compte) {
		compteService.save(compte);
	}
	
	@RequestMapping(value="/comptes/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") long idCompte) {
		compteService.delete(idCompte);
	}
}
