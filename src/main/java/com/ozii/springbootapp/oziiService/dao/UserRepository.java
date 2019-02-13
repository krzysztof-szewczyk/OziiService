package com.ozii.springbootapp.oziiService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ozii.springbootapp.oziiService.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
