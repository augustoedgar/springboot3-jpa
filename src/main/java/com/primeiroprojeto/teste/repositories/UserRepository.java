package com.primeiroprojeto.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.teste.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
