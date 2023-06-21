package com.spring.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.blogapp.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
