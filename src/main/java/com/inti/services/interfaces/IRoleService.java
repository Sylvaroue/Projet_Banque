package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.Role;

public interface IRoleService {

	public List<Role> findAll();
	
	public Role save(Role role);

	public Optional<Role> findById(Long idRole);

	public void delete(Long idRole);
}
