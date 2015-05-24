package cz.jiripinkas.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.jiripinkas.jba.entity.Blog;
import cz.jiripinkas.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{
	/*
	this user is an attribute in the blog entity
	spring data jpa will provide an implementation of this which 
	ll be basically select all blogs wch r assciated wt user entity*/
	
	List<Blog> findByUser(User user);
	

}
