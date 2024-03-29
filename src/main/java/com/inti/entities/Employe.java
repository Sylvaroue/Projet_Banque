package com.inti.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Employe extends User {

	private String affectation;
	
	@OneToMany(mappedBy = "employe")
	Set<Client> clients;
	
	@OneToMany(mappedBy = "employe")
	Set<Commentaire> commentaires;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(String nomUser, String prenomUser, String username, String password, Role role, String affectation) {
		super(nomUser, prenomUser, username, password, role);
		// TODO Auto-generated constructor stub
		this.affectation = affectation;
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
