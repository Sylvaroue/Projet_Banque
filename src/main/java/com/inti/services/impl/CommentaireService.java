package com.inti.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Client;
import com.inti.entities.Commentaire;
import com.inti.repositories.CommentaireRepository;
import com.inti.services.interfaces.ICommentaireService;




@Service
public class CommentaireService implements ICommentaireService {

	@Autowired
	CommentaireRepository commentaireRepository;

	@Override
	public List<Commentaire> findAll() {
		return commentaireRepository.findAll();
	}

	@Override
	public Optional<Commentaire> findById(Long idCommentaire) {
		return commentaireRepository.findById(idCommentaire);
	}

	@Override
	public Commentaire save(Commentaire commentaire) {
		return commentaireRepository.save(commentaire);
	}

	@Override
	public void delete(Long idCommentaire) {
		commentaireRepository.deleteById(idCommentaire);
	
}
}
