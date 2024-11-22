package com.example.laba5.repositories;

import com.example.laba5.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<com.example.laba5.models.Category, Long> {
}