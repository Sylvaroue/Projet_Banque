package com.inti.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client extends User {
	
	@OneToMany(mappedBy = "client")
	Set<Compte> comptes;
	
	@ManyToOne
	Employe employe;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nomUser, String prenomUser, String username, String password, Role role) {
		super(nomUser, prenomUser, username, password, role);
		// TODO Auto-generated constructor stub
	}

	public Set<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

		
	
}
