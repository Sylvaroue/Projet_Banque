package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Operation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idoperation ;
	private float montant;
	private String type;
	private String libelle;
	
	@OneToMany(mappedBy = "operation")
	List<Commentaire> commentaire;
	
	@ManyToOne
	Compte compte;

	public Operation(float montant, String type, String libelle, List<Commentaire> commentaire, Compte compte) {
		super();
		this.montant = montant;
		this.type = type;
		this.libelle = libelle;
		this.commentaire = commentaire;
		this.compte = compte;
	}

	public Operation() {
		super();
	}

	public long getIdoperation() {
		return idoperation;
	}

	public void setIdoperation(long idoperation) {
		this.idoperation = idoperation;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
