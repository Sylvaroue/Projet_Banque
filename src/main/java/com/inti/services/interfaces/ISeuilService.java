package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.Seuil;

public interface ISeuilService {

public List<Seuil> findAll();
	
	public Seuil save(Seuil seuil);

	public Optional<Seuil> findById(Long idSeuil);

	public void delete(Long idSeuil);
}
