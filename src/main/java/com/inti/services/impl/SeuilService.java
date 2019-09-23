package com.inti.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Seuil;
import com.inti.repositories.CompteRepository;
import com.inti.repositories.SeuilRepository;
import com.inti.services.interfaces.ISeuilService;



@Service
public class SeuilService implements ISeuilService {
	
	@Autowired
	SeuilRepository seuilRepository;
	
	@Autowired
	CompteRepository compteRepository;

	@Override
	public List<Seuil> findAll() {
		return seuilRepository.findAll();
	}

	@Override
	public Optional<Seuil> findById(Long idSeuil) {
		return seuilRepository.findById(idSeuil);
	}

	@Override
	public Seuil save(Seuil seuil) {
		return seuilRepository.save(seuil);
	}

	@Override
	public void delete(Long idSeuil) {
		seuilRepository.deleteById(idSeuil);
		
	}

	@Override
	public void updateSeuil(Seuil seuil) {
	this.seuilRepository.save(seuil);
	}
	
		
	}
	
	




