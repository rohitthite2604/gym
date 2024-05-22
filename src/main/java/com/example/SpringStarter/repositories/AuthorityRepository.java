package com.example.SpringStarter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringStarter.models.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
