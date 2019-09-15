package com.inti.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcompte;
	private float solde;
	
	@ManyToOne
	Client client;
	
	@OneToMany(mappedBy = "compte")
	List<Operation> operations;

	@OneToMany(mappedBy = "compte")
	List<Seuil> seuil;
	
	public Compte(float solde, Client client, List<Operation> operations) {
		super();
		this.solde = solde;
		this.client = client;
		this.operations = operations;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public List<Seuil> getSeuil() {
		return seuil;
	}

	public void setSeuil(List<Seuil> seuil) {
		this.seuil = seuil;
	}

}
