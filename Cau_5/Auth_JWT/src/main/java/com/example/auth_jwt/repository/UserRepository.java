package com.example.auth_jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.auth_jwt.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
