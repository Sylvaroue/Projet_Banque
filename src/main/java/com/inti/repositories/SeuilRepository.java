package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Seuil;

@Repository
public interface SeuilRepository extends JpaRepository<Seuil, Long> {

	
}
