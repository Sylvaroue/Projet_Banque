package com.inti.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Client;
import com.inti.entities.Compte;
import com.inti.repositories.ClientRepository;
import com.inti.repositories.CompteRepository;
import com.inti.services.interfaces.IClientService;



@Service
public class ClientService implements IClientService {
	
	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	CompteRepository compteRepository;

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Optional<Client> findById(Long idUser) {
		return clientRepository.findById(idUser);
	}

	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void delete(Long idClient) {
		clientRepository.deleteById(idClient);
	}

	@Override
	public Optional<Client> findByUsername(String username) {
		return clientRepository.findByUsername(username);
	}

	@Override
	public List<Compte> findByClient(Client client) {
		return compteRepository.findByClient(client);
	}
	
}
