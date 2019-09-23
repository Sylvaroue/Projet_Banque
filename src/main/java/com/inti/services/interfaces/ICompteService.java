package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Compte;
import com.inti.entities.Operation;
import com.inti.entities.Seuil;

public interface ICompteService {

	public List<Compte> findAll();

	public Compte findOne(Long idCompte);

	public Compte save(Compte compte);

	public void delete(Long idCompte);
	
	public List<Operation> findOpByCompte(Compte compte);
	
	public List<Seuil> findSeByCompte(Compte compte);
	
	public Compte soldeMaj(Compte compte);
	
	public float soldeMois(Compte compte);
	
	public float soldeAnnee(Compte compte);

}
