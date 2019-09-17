package com.inti.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Employe;
import com.inti.repositories.EmployeRepository;
import com.inti.services.interfaces.IEmployeService;



@Service
public class EmployeService implements IEmployeService {
	
	@Autowired
	EmployeRepository employeRepository;

	@Override
	public List<Employe> findAll() {
		return employeRepository.findAll();
	}

	@Override
	public Employe save(Employe employe) {
		return employeRepository.save(employe);
	}

	@Override
	public void delete(Long idUser) {
		employeRepository.deleteById(idUser);
	}

	@Override
	public Optional<Employe> findById(long idUser) {
		// TODO Auto-generated method stub
		return employeRepository.findById(idUser);
	}
}
