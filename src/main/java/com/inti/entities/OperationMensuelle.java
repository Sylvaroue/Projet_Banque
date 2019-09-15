package com.inti.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class OperationMensuelle extends Operation {

	@Temporal(TemporalType.DATE)
	private Date datedebut;
	@Temporal(TemporalType.DATE)
	private Date datefin;
	
	public OperationMensuelle(float montant, String type, String libelle, List<Commentaire> commentaire, Compte compte,
			Date datedebut, Date datefin) {
		super(montant, type, libelle, compte);
		this.datedebut = datedebut;
		this.datefin = datefin;
	}
	public OperationMensuelle(float montant, String type, String libelle, List<Commentaire> commentaire,
			Compte compte) {
		super(montant, type, libelle, compte);
	}
	public Date getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}
	public Date getDatefin() {
		return datefin;
	}
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}

	
}
