package com.inti.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRole;
	
	private String intitule;
	
	@OneToMany(mappedBy = "role")
	private Set<User> utilisateurs;

	public Role() {
		super();
	}

	public Role(String intitule) {
		super();
		this.intitule = intitule;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Set<User> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(Set<User> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	
}
