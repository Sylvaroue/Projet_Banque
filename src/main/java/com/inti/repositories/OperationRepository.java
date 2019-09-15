package com.inti.repositories;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {
	
	public Operation opMensuelle(Date date, int nbMois);

}
