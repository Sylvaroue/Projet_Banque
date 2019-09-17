package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.User;



public interface IUserService {
	
	public List<User> findAll();
	
	public User save(User user);

	public Optional<User> findById(Long idUser);

	public void delete(Long idUser);

}
