package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Employe;
import com.inti.repositories.EmployeRepository;



@Service
public class EmployeService {
	
	@Autowired
	EmployeRepository employeRepository;

	@Override
	public List<Employe> findAll() {
		return employeRepository.findAll();
	}

	@Override
	public Employe findById(Long idEmploye) {
		return employeRepository.findById(idEmploye).orElse(null);
	}

	@Override
	public Employe save(Employe employe) {
		return employeRepository.save(employe);
	}

	@Override
	public void delete(Long idEmploye) {
		employeRepository.deleteById(idEmploye);
	
	

}
}
