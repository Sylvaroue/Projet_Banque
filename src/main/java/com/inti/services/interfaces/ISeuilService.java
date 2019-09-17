package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Seuil;

public interface ISeuilService {

public List<Seuil> findAll();
	
	public Seuil save(Seuil seuil);

	public Seuil findById(Long idSeuil);

	public void delete(Long idSeuil);
}
