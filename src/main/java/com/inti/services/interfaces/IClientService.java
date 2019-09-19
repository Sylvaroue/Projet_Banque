package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.Client;
import com.inti.entities.Compte;

public interface IClientService {
	
	public List<Client> findAll();
	
	public Client save(Client client);

	public Optional<Client> findById(Long idUser);
	
	public List<Compte> findByClient(Client client);
	
	public void updateClient(Client client);

	public void delete(Long idUser);
	
	public Optional<Client> findByUsername(String username);

}
