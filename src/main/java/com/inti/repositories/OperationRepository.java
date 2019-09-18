package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Compte;
import com.inti.entities.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {

	public List<Operation> findByCompte(Compte compte);
}
