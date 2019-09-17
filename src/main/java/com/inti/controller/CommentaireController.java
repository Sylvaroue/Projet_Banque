package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Commentaire;
import com.inti.services.interfaces.ICommentaireService;

@RestController
@RequestMapping(value = "/")
public class CommentaireController {

	@Autowired
	ICommentaireService commentaireService ;
	
	@RequestMapping(value="/commentaires", method = RequestMethod.GET)
	public List<Commentaire> findAll() {
		return commentaireService.findAll();
	}
	
	@RequestMapping(value="/commentaires/{id}", method = RequestMethod.GET)
	public Commentaire findById(@PathVariable("id") Long idCommentaire) {
		return commentaireService.findById(idCommentaire);
	}
	
	@RequestMapping(value="/commentaires", method = RequestMethod.POST)
	public void save(@RequestBody Commentaire commentaire) {
		commentaireService.save(commentaire);
	}
	
	@RequestMapping(value="/commentaires/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") long idCommentaire) {
		commentaireService.delete(idCommentaire);
	}
}
