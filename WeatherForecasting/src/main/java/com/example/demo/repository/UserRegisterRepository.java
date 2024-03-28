package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserRegister;

public interface UserRegisterRepository extends JpaRepository<UserRegister,Long>{
	Optional<UserRegister>findByUsername(String username);
}
