package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Compte;
import com.inti.entities.Operation;

public interface ICompteService {

	public List<Compte> findAll();

	public Compte findOne(Long idCompte);

	public Compte save(Compte compte);

	public void delete(Long idCompte);
	
	public List<Operation> findOpByCompte(Compte compte);
	
	//public Compte soldeSimu(Compte compte);
}
