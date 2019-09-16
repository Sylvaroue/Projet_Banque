package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {
	
	public Operation opMensuelle(Operation operation, int nbMois);

}
