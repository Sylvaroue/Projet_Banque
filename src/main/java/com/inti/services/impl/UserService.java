package com.inti.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Client;
import com.inti.entities.User;
import com.inti.repositories.UserRepository;
import com.inti.services.interfaces.IUserService;



@Service
public class UserService implements IUserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findById(Long idUser) {
		return userRepository.findById(idUser);
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(Long idUser) {
		userRepository.deleteById(idUser);
}
}