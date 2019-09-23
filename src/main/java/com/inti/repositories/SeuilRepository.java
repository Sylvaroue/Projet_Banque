package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Compte;
import com.inti.entities.Seuil;

@Repository
public interface SeuilRepository extends JpaRepository<Seuil, Long> {

	public List<Seuil> findByCompte(Compte compte);
}
