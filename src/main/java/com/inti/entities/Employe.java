package com.inti.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employe extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmploye;
	private String affectation;
	
	@OneToMany(mappedBy = "employe")
	Set<Client> clients;
	
	@OneToMany(mappedBy = "employe")
	Set<Commentaire> commentaires;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(String nomUser, String prenomUser, String password, Role role, String affectation) {
		super(nomUser, prenomUser, password, role);
		// TODO Auto-generated constructor stub
		this.affectation = affectation;
	}

	public Long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getAffectation() {
		return affectation;
	}

	public void setAffectation(String affectation) {
		this.affectation = affectation;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	public Set<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(Set<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}
	
	
}
