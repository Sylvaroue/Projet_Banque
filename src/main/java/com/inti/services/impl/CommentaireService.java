package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Client;
import com.inti.entities.Commentaire;
import com.inti.repositories.CommentaireRepository;




@Service
public class CommentaireService {

	@Autowired
	CommentaireRepository commentaireRepository;

	@Override
	public List<Commentaire> findAll() {
		return commentaireRepository.findAll();
	}

	@Override
	public Commentaire findById(Long idCommentaire) {
		return commentaireRepository.findById(idCommentaire).orElse(null);
	}

	@Override
	public Client save(Commentaire commentaire) {
		return commentaireRepository.save(commentaire);
	}

	@Override
	public void delete(Long idCommentaire) {
		commentaireRepository.deleteById(idCommentaire);
	
}
