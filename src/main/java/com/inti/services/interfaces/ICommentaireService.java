package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.Commentaire;

public interface ICommentaireService {
	
	public List<Commentaire> findAll();
	
	public Commentaire save(Commentaire commentaire);
	
	public Optional<Commentaire> findById(Long idCommentaire);
	
	public void delete(Long idCommentaire);

}
