package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {

}
