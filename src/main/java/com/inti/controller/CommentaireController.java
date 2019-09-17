package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Commentaire;
import com.inti.services.interfaces.ICommentaireService;

@RestController
@RequestMapping(value = "/")
public class CommentaireController {

	@Autowired
	ICommentaireService commentaireService ;
	
	@GetMapping(value="commentaires")
	public List<Commentaire> findAll() {
		return commentaireService.findAll();
	}
	
	@GetMapping(value="commentaire/{id}")
	public Commentaire findById(@PathVariable("id") Long idCommentaire) {
		return commentaireService.findById(idCommentaire).orElse(null);
	}
	
	@PostMapping(value="commentaire")
	public Commentaire save(@RequestBody Commentaire commentaire) {
		return commentaireService.save(commentaire);
	}
	
	@DeleteMapping(value="commentaire/{id}")
	public void delete(@PathVariable("id") long idCommentaire) {
		commentaireService.delete(idCommentaire);
	}
}
