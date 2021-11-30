package com.sreenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sreenu.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User  findByUsername(String username);
	
	
}
