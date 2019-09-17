package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Seuil;
import com.inti.repositories.SeuilRepository;



@Service
public class SeuilService {
	
	@Autowired
	SeuilRepository seuilRepository;

	@Override
	public List<Seuil> findAll() {
		return seuilRepository.findAll();
	}

	@Override
	public Seuil findById(Long idSeuil) {
		return seuilRepository.findById(idSeuil).orElse(null);
	}

	@Override
	public Seuil save(Seuil seuil) {
		return seuilRepository.save(seuil);
	}

	@Override
	public void delete(Long idEmploye) {
		seuilRepository.deleteById(idEmploye);
	
	

}

}
