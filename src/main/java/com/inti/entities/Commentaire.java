package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Commentaire implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcom;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String message;

	@ManyToOne
	private Employe employe;
	
	@ManyToOne
	private Operation operation;

	public Commentaire(Date date, String message, Employe employe, Operation operation) {
		super();
		this.date = date;
		this.message = message;
		this.employe = employe;
		this.operation = operation;
	}

	public Commentaire() {
		super();
	}

	public Long getIdcom() {
		return idcom;
	}

	public void setIdcom(Long idcom) {
		this.idcom = idcom;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
}
