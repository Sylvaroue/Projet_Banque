package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Compte;
import com.inti.services.interfaces.ICompteService;

@RestController
@RequestMapping(value = "/")
public class CompteController {

	@Autowired
	ICompteService compteService ;
	
	@GetMapping(value="comptes")
	public List<Compte> findAll() {
		return compteService.findAll();
	}
	
	@GetMapping(value="compte/{id}")
	public Compte findCompteById(@PathVariable("id") Long idCompte) {
		return compteService.findOne(idCompte).orElse(null);
	}
	
	@PostMapping(value="compte")
	public Compte saveCompte(@RequestBody Compte compte) {
		return compteService.save(compte);
	}
	
	@DeleteMapping(value="compte/{id}")
	public void deleteCompte(@PathVariable("id") long idCompte) {
		compteService.delete(idCompte);
	}
	
	@PutMapping(value="solde/{id}")
	public Compte updateSolde(@PathVariable("id") long idCompte, @RequestBody Compte compte) {
		if(compteService.findOne(idCompte) == null) {
			return null;
		} else 
			compteService.soldeMaj(compte);
			return compteService.save(compte);
	}
}
