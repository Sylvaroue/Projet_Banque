package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Compte;
import com.inti.entities.Operation;
import com.inti.services.interfaces.ICompteService;

@RestController
@RequestMapping(value = "/")
@CrossOrigin(origins = "http://localhost:4200")
public class CompteController {

	@Autowired
	ICompteService compteService ;
	
	@GetMapping(value="comptes")
	public List<Compte> findAll() {
		return compteService.findAll();
	}
	
	@GetMapping(value="compte/{id}")
	public Compte findCompteById(@PathVariable("id") Long idCompte) {
		return compteService.findOne(idCompte);
	}
	
	@PostMapping(value="compte")
	public Compte saveCompte(@RequestBody Compte compte) {
		return compteService.save(compte);
	}
	
	@DeleteMapping(value="compte/{id}")
	public void deleteCompte(@PathVariable("id") long idCompte) {
		compteService.delete(idCompte);
	}
	
	@GetMapping(value="ops-compte/{idCompte}")
	public List<Operation> findComptesClient(@PathVariable("idCompte") Long idCompte) {
		Compte compte = compteService.findOne(idCompte);
		return compteService.findOpByCompte(compte);
	}
	
	//Ne pas utiliser, ça ne fonctionne pas !
	/*@PutMapping(value="solde/{id}")
	public Compte updateSolde(@PathVariable("id") long idCompte, @RequestBody Compte compte) {
		if(compteService.findOne(idCompte) == null) {
			return null;
		} else 
			compteService.soldeSimu(compte);
			return compteService.save(compte);
	}*/
}
