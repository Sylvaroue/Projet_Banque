package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Client;
import com.inti.entities.User;



@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Client findById(Long idUser) {
		return userRepository.findById(idUser).orElse(null);
	}

	@Override
	public Client save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(Long idUser) {
		userRepository.deleteById(idUser);
}
}