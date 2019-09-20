package com.inti.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCompte;
	private String intitule;
	private float solde;
	
	@ManyToOne
	Client client;
	
	@JsonIgnore
	@OneToMany(mappedBy = "compte")
	List<Operation> operations;

	@JsonIgnore
	@OneToMany(mappedBy = "compte")
	List<Seuil> seuil;
	
	public Compte(float solde, String intitule, Client client) {
		super();
		this.solde = solde;
		this.client = client;
		this.intitule = intitule;
	}

	public Compte() {
		super();
	}

	public long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(long idCompte) {
		this.idCompte = idCompte;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
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
