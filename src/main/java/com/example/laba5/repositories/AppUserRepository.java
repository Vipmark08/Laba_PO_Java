package com.example.laba5.repositories;

import com.example.laba5.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long>{
    AppUser findByEmail(String email);
}