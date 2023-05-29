package com.javaweb.levi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.levi.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
