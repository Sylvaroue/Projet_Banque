package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.Compte;

public interface ICompteService {

	public List<Compte> findAll();

	public Optional<Compte> findOne(Long idCompte);

	public Compte save(Compte compte);

	public void delete(Long idCompte);
	
	public Compte soldeMaj(Compte compte);
}
