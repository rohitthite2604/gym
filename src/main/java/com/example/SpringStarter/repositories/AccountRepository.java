package com.example.SpringStarter.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringStarter.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    Optional<Account> findOneByEmailIgnoreCase(String email);
    
}
