package com.example.demo.Team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRespon extends JpaRepository<Team, Integer> {

}
