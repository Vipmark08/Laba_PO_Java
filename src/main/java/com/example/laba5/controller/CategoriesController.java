package com.example.laba5.controller;

import com.example.laba5.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController {
    @Autowired
    CategoriesRepository categoriesRepository;
}