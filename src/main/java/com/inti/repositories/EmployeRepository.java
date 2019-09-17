package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
