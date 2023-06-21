package com.spring.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.blogapp.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
