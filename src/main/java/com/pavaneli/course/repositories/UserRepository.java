package com.pavaneli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavaneli.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
