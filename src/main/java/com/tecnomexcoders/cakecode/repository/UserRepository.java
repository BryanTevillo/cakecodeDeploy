package com.tecnomexcoders.cakecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tecnomexcoders.cakecode.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
} 
 