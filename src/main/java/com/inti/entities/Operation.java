package com.inti.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Operation{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idOperation ;
	private float montant;
	private String type;
	private String libelle;
	@Temporal(TemporalType.DATE)
	private Date dateOperation;
	
	@OneToMany(mappedBy = "operation")
	List<Commentaire> commentaire;
	
	@ManyToOne
	Compte compte;

	public Operation(float montant, String type, String libelle, Date dateOperation, Compte compte) {
		super();
		this.montant = montant;
		this.type = type;
		this.libelle = libelle;
		this.dateOperation = dateOperation;
		this.compte = compte;
	}

	public Operation() {
		super();
	}

	public long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(long idOperation) {
		this.idOperation = idOperation;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public List<Commentaire> getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(List<Commentaire> commentaire) {
		this.commentaire = commentaire;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}
