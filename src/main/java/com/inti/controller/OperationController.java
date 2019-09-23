package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Operation;
import com.inti.services.interfaces.IOperationService;

@RestController
@RequestMapping(value="/")
@CrossOrigin(origins = "http://localhost:4200")
public class OperationController {

	@Autowired
	IOperationService operationService;
	
	@GetMapping(value = "operations")
	public List<Operation> findAllOperation() {
		return operationService.findAll();
	}
	
	@GetMapping(value = "operation/{idOperation}")
	public Operation findOneOperation(@PathVariable("idOperation") Long idOperation) {
		return operationService.findOne(idOperation).orElse(null);
	}
	
	@PostMapping(value = "operation_single")
	public Operation saveOperation(@RequestBody Operation operation) {
		return operationService.save(operation);
	}
	
	@PostMapping(value = "operation_repeat/{nbMois}")
	public List<Operation> saveOperationMensuelle(@RequestBody Operation operation, @PathVariable("nbMois") int nbMois) {
		return operationService.opMensuelle(operation, nbMois);
	}
	
	@DeleteMapping(value = "operation/{idOperation}")
	public void deleteOperation(@PathVariable("idOperation") Long idOperation) {
		operationService.delete(idOperation);
	}
}
