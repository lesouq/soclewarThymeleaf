package com.soclewarthymeleaf.soclewarthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soclewarthymeleaf.soclewarthymeleaf.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}
