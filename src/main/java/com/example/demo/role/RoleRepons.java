package com.example.demo.role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepons extends JpaRepository<Role, Long> {

	Role findByName (String name);
}
