package com.vtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtech.model.User;

@Repository

public interface userRepository extends JpaRepository<User, Long> {

	
}


