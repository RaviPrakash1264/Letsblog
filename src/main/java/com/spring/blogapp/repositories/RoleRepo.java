package com.spring.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.blogapp.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
