package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Compte;
import com.inti.entities.Operation;
import com.inti.entities.Seuil;
import com.inti.repositories.CompteRepository;
import com.inti.repositories.OperationRepository;
import com.inti.repositories.SeuilRepository;
import com.inti.services.interfaces.ICompteService;

@Service
public class CompteService implements ICompteService {

	@Autowired
	CompteRepository compteRepository;
	
	@Autowired
	OperationRepository operationRepository;
	
	@Autowired
	SeuilRepository seuilRepository;
	
	@Override
	public List<Compte> findAll() {
		List<Compte> cpts = this.compteRepository.findAll();
		for(Compte cpt : cpts) {
			cpt.setOperations(this.operationRepository.findByCompte(cpt));
		}
		return cpts;
	}

	@Override
	public Compte findOne(Long idCompte) {
		Compte cpt = this.compteRepository.findById(idCompte).orElse(null);
		cpt.setOperations(this.operationRepository.findByCompte(cpt));
		return cpt;
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
	public List<Operation> findOpByCompte(Compte compte) {
		return operationRepository.findByCompte(compte);
	}

	@Override
	public List<Seuil> findSeByCompte(Compte compte) {
		return seuilRepository.findByCompte(compte);
	}
	
	//Ne pas utiliser, ça ne fonctionne pas !
	/*@Override
	public Compte soldeSimu(Compte compte) {
		List<Operation> opSolde = operationRepository.findByCompte(compte);
		float soldeNew = compte.getSolde();
		boolean eph = false;
		for (Operation opModif : opSolde) {
			float modifier = opModif.getMontant();
			if (opModif.getType() == "dépense") {
				soldeNew -= modifier;
			} else {
				soldeNew += modifier;
			}
		}
		compte.setSolde(soldeNew);
		for (Compte cpt : compteRepository.findAll()) {
			if (cpt.getIdCompte() == 0) eph = true;
		}
		if (eph = false) {
			compte.setIdCompte(0);
		} else {
			compteRepository.deleteById((long) 0);
			compte.setIdCompte(0);
		}
		return compte;
	}
*/
}
