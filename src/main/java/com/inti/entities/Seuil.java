package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Seuil {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idSeuil;
	private String nomSeuil;
	private int valeur;
	
	@ManyToOne
	private Compte compte;

	public Seuil() {
		super();
	}

	public Seuil(String nomSeuil, int valeur, Compte compte) {
		super();
		this.nomSeuil = nomSeuil;
		this.valeur = valeur;
		this.compte = compte;
	}

	public Long getIdSeuil() {
		return idSeuil;
	}

	public void setIdSeuil(Long idSeuil) {
		this.idSeuil = idSeuil;
	}

	public String getNomSeuil() {
		return nomSeuil;
	}

	public void setNomSeuil(String nomSeuil) {
		this.nomSeuil = nomSeuil;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
}
