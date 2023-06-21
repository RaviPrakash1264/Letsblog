package com.spring.blogapp.services;

import java.util.List;

import com.spring.blogapp.entities.Post;
import com.spring.blogapp.payloads.PostDto;
import com.spring.blogapp.payloads.PostResponse;

public interface PostService {

	//create 

	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);

	//update 

	PostDto updatePost(PostDto postDto, Integer postId);

	// delete

	void deletePost(Integer postId);
	
	//get all posts
	
	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
	
	//get single post
	
	PostDto getPostById(Integer postId);
	
	//get all posts by category
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search posts
	List<PostDto> searchPosts(String keyword);

}
