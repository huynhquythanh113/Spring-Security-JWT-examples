package com.example.demo.Match;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranDauRespon extends JpaRepository<TranDau, Integer>{

}
