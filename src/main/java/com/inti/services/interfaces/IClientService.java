package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.Client;

public interface IClientService {
	
	public List<Client> findAll();
	
	public Client save(Client client);

	public Optional<Client> findById(Long idUser);

	public void delete(Long idUser);

}
