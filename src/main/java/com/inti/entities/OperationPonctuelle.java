package com.inti.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class OperationPonctuelle extends Operation {
	
	@Temporal(TemporalType.DATE)
	private Date dateoperation;

	public OperationPonctuelle(float montant, String type, String libelle, List<Commentaire> commentaire, Compte compte,
			Date dateoperation) {
		super(montant, type, libelle, commentaire, compte);
		this.dateoperation = dateoperation;
	}

	public OperationPonctuelle(float montant, String type, String libelle, List<Commentaire> commentaire,
			Compte compte) {
		super(montant, type, libelle, commentaire, compte);
	}

	public Date getDateoperation() {
		return dateoperation;
	}

	public void setDateoperation(Date dateoperation) {
		this.dateoperation = dateoperation;
	}
	
	

}
