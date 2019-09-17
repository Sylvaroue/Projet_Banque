package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Client;
import com.inti.repositories.ClientRepository;



@Service
public class ClientService {
	
	@Autowired
	ClientRepository clientRepository;

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client findById(Long idClient) {
		return clientRepository.findById(idClient).orElse(null);
	}

	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void delete(Long idClient) {
		clientRepository.deleteById(idClient);
	
	

}
	
}
