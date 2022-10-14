package com.example.demo.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import antlr.collections.List;
@Repository
public interface  UserRepons extends JpaRepository<User, Long> {
	@Query("SELECT u from User u where u.name = ?1 ")
	Optional<User> findUserByName(String name);

	User findByName(String name);
}
