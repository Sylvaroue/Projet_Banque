package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.Operation;

public interface IOperationService {

	public List<Operation> findAll();

	public Optional<Operation> findOne(Long idOperation);

	public Operation save(Operation classe);

	public void delete(Long idOperation);
	
	public List<Operation> opMensuelle(Operation operation, int nbMois);
	
}
