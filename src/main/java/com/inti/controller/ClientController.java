package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Client;
import com.inti.entities.Compte;
import com.inti.services.interfaces.IClientService;

@RestController
@RequestMapping(value = "/")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

	@Autowired
	IClientService clientService ;
	
	@GetMapping(value="clients")
	public List<Client> findAll() {
		return clientService.findAll();
	}
	
	@GetMapping(value="client/{id}")
	public Client findById(@PathVariable("id") Long idClient) {
		return clientService.findById(idClient).orElse(null);
	}
	
	@PostMapping(value="client")
	public Client save(@RequestBody Client client) {
		return clientService.save(client);
	}
	
	@DeleteMapping(value="client/{id}")
	public void delete(@PathVariable("id") long idClient) {
		clientService.delete(idClient);
	}
	
	@GetMapping(value="client/username/{username}")
	public Client findByUsername(@PathVariable("username") String username) {
		return clientService.findByUsername(username).orElse(null);
	}
	
	@GetMapping(value="comptesclient/{idClient}")
	public List<Compte> findComptesClient(@PathVariable("idClient") Long idClient) {
		Client client = clientService.findById(idClient).orElse(null);
		return clientService.findByClient(client);
	}
}
