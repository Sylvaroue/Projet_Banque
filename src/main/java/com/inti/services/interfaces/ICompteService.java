package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Compte;

public interface ICompteService {

	public List<Compte> findAll();

	public Compte findOne(Long idCompte);

	public Compte save(Compte compte);

	public void delete(Long idCompte);
	
	public Compte soldeMaj(Compte compte);
}
