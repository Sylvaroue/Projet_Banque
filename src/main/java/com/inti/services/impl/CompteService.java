package com.inti.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Compte;
import com.inti.entities.Operation;
import com.inti.repositories.CompteRepository;
import com.inti.services.interfaces.ICompteService;

@Service
public class CompteService implements ICompteService {

	@Autowired
	CompteRepository compteRepository;
	
	@Override
	public List<Compte> findAll() {
		return compteRepository.findAll();
	}

	@Override
	public Optional<Compte> findOne(Long idCompte) {
		return compteRepository.findById(idCompte);
	}

	@Override
	public Compte save(Compte compte) {
		return compteRepository.save(compte);
	}

	@Override
	public void delete(Long idCompte) {
		compteRepository.deleteById(idCompte);
		
	}

	@Override
	public Compte soldeMaj(Compte compte) {
		List<Operation> opSolde = compte.getOperations();
		float soldeNew = compte.getSolde();
		for (Operation opModif : opSolde) {
			float modifier = opModif.getMontant();
			if (opModif.getType() == "dépense") {
				soldeNew -= modifier;
			} else {
				soldeNew += modifier;
			}
		}
		compte.setSolde(soldeNew);
		return compte;
	}

}
