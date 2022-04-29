package com.example.demo.repository;

import com.example.demo.model.Women;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WomenRepository extends JpaRepository<Women,Integer> {
}
