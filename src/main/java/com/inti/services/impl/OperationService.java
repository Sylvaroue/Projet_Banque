package com.inti.services.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Operation;
import com.inti.repositories.OperationRepository;
import com.inti.services.interfaces.IOperationService;

@Service
public class OperationService implements IOperationService {

	@Autowired
	OperationRepository operationRepository;
	
	@Override
	public List<Operation> findAll() {
		return operationRepository.findAll();
	}

	@Override
	public Optional<Operation> findOne(Long idOperation) {
		return operationRepository.findById(idOperation);
	}

	@Override
	public Operation save(Operation operation) {
		return operationRepository.save(operation);
	}

	@Override
	public void delete(Long idOperation) {
		operationRepository.deleteById(idOperation);
	}

	@Override
	@Transactional(rollbackOn = Exception.class)
	public List<Operation> opMensuelle(Operation operation, int nbMois) {
		operationRepository.save(operation);
		List<Operation> operationsM = new ArrayList<Operation>();
		operationsM.add(operation);
		int c = 0;
		int a = 0;
		for (int i=0 ; i < nbMois ; i++) {
			Operation repeat = new Operation();
			repeat.setIdOperation(operation.getIdOperation()+1+i);
			repeat.setMontant(operation.getMontant());
			repeat.setLibelle(operation.getLibelle());
			repeat.setType(operation.getType());
			repeat.setCompte(operation.getCompte());
			Date dateInit = operation.getDateOperation();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dateInit);
			int mInit = calendar.get(Calendar.MONTH);
			int aInit = calendar.get(Calendar.YEAR);
			if (mInit+i >= 11) {
				mInit = c;
				aInit += 1;
				c += 1;
				if (c == 13) {
					aInit += a;
					a += 1;
				}
			}
			else {
				mInit +=(i+1);
			}
			calendar.set(Calendar.MONTH, mInit);
			calendar.set(Calendar.YEAR, aInit);
			dateInit = calendar.getTime();
			repeat.setDateOperation(dateInit);
			operationsM.add(repeat);
		}
		for (int i=1 ; i <= nbMois ; i++) {
			operationRepository.save(operationsM.get(i));
		}
		return operationsM;
	}
}
