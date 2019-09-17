package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Employe;

public interface IEmployeService {
	
	public List<Employe> findAll();
	
	public Employe save(Employe employe);
	
	public Employe findById(long idEmploye);
	
	public void delete(Long idEmploye);

}
