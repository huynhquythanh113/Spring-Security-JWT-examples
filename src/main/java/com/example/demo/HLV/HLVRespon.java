package com.example.demo.HLV;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HLVRespon extends JpaRepository<HLV, Integer> {

}
