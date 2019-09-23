package com.inti.services.impl;

import java.util.Calendar;
import java.util.Date;
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
	
	@Override
	public Compte soldeMaj(Compte compte) {
		List<Operation> opSolde = operationRepository.findByCompte(compte);
		float soldeNew = compte.getSolde();
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		
		for (Operation opModif : opSolde) {
			Date dateOp = opModif.getDateOperation();
			if (dateOp.compareTo(today) < 0) {
				float modifier = opModif.getMontant();
				if (opModif.getType().compareTo("dépense") == 0) {
					soldeNew -= modifier;
				} else {
					soldeNew += modifier;
				}
				operationRepository.delete(opModif);
			}
		}
		compte.setSolde(soldeNew);
		return compteRepository.save(compte);
	}

	@Override
	public float soldeMois(Compte compte) {
		float solde = compte.getSolde();
		Calendar month = Calendar.getInstance();
		int aCurrent = month.get(Calendar.YEAR);
		int mCurrent = month.get(Calendar.MONTH);
		List<Operation> opSolde = operationRepository.findByCompte(compte);
		
		for (Operation opModif : opSolde) {
			Date date = opModif.getDateOperation();
			Calendar opCalendar = Calendar.getInstance();
			opCalendar.setTime(date);
			if (aCurrent == opCalendar.get(Calendar.YEAR) && mCurrent == opCalendar.get(Calendar.MONTH)) {
				float modifier = opModif.getMontant();
				if (opModif.getType().compareTo("dépense") == 0) {
					solde -= modifier;
				} else {
					solde += modifier;
				}
			}
		}		
		return solde;
	}
 
	@Override
	public float soldeAnnee(Compte compte) {
		float solde = compte.getSolde();
		Calendar year = Calendar.getInstance();
		int aCurrent = year.get(Calendar.YEAR);
		List<Operation> opSolde = operationRepository.findByCompte(compte);
		
		for (Operation opModif : opSolde) {
			Date date = opModif.getDateOperation();
			Calendar opCalendar = Calendar.getInstance();
			opCalendar.setTime(date);
			if (aCurrent == opCalendar.get(Calendar.YEAR)) {
				float modifier = opModif.getMontant();
				if (opModif.getType().compareTo("dépense") == 0) {
					solde -= modifier;
				} else {
					solde += modifier;
				}
			}
		}		
		return solde;
	}

}
