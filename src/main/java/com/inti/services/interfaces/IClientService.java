package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Client;

public interface IClientService {
	
	public List<Client> findAll();
	
	public Client save(Client client);

	public Client findById(Long idClient);

	public void delete(Long idClient);

}
