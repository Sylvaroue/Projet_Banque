package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.Employe;

public interface IEmployeService {
	
	public List<Employe> findAll();
	
	public Employe save(Employe employe);
	
	public Optional<Employe> findById(long idUser);
	
	public void delete(Long idUser);

}
