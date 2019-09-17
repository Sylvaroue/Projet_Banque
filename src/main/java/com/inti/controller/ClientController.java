package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Client;
import com.inti.services.interfaces.IClientService;



@RestController
@RequestMapping(value = "/")
public class ClientController {

	@Autowired
	IClientService clientService ;
	
	@RequestMapping(value="/clients", method = RequestMethod.GET)
	public List<Client> findAll() {
		return clientService.findAll();
	}
	
	@RequestMapping(value="/clients/{id}", method = RequestMethod.GET)
	public Client findById(@PathVariable("id") Long idClient) {
		return clientService.findById(idClient);
	}
	
	@RequestMapping(value="/clients", method = RequestMethod.POST)
	public void save(@RequestBody Client client) {
		clientService.save(client);
	}
	
	@RequestMapping(value="/clients/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") long idClient) {
		clientService.delete(idClient);
	}
	
}
