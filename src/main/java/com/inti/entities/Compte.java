package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Compte implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcompte;
	private float solde;
	
	@OneToMany(mappedBy = "compte")
	List<Operation> operation;

	@OneToMany(mappedBy = "seuil")
	List<Seuil> seuil;
	
	public Compte(float solde, List<Operation> operation) {
		super();
		this.solde = solde;
		this.operation = operation;
	}

	public Compte() {
		super();
	}

	public long getIdcompte() {
		return idcompte;
	}

	public void setIdcompte(long idcompte) {
		this.idcompte = idcompte;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public List<Operation> getOperation() {
		return operation;
	}

	public void setOperation(List<Operation> operation) {
		this.operation = operation;
	}

	public List<Seuil> getSeuil() {
		return seuil;
	}

	public void setSeuil(List<Seuil> seuil) {
		this.seuil = seuil;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	

}
