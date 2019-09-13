package com.inti.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	
	@OneToMany(mappedBy = "client")
	Set<Compte> comptes;
	
	@ManyToOne
	Employe employe;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nomUser, String prenomUser, String password, Role role) {
		super(nomUser, prenomUser, password, role);
		// TODO Auto-generated constructor stub
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
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
