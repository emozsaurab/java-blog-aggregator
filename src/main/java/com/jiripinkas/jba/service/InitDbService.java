package com.jiripinkas.jba.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.jiripinkas.jba.entity.Blog;
import cz.jiripinkas.jba.entity.Item;
import cz.jiripinkas.jba.entity.Role;
import cz.jiripinkas.jba.entity.User;
import cz.jiripinkas.jba.repository.BlogRepository;
import cz.jiripinkas.jba.repository.ItemRepository;
import cz.jiripinkas.jba.repository.RoleRepository;
import cz.jiripinkas.jba.repository.UserRepository;

@Transactional
@Service
public class InitDbService {
	
    @Autowired //it will create an instance of some class(inbuilt ,see in the init method of this class save method is inbuilt),that class will internally implements the  roleRepository interface
	RoleRepository roleRepository;
    
    @Autowired
    ItemRepository   itemRepository;
    
    @Autowired
    BlogRepository blogRepository;
    
    @Autowired
    UserRepository userRepository;
    
     //it means this method will be called after spring 
    //context creation which will created after spring application startup/deployment
    @PostConstruct
    public void init(){
    	Role roleUser = new Role();
    	roleUser.setName("ROLE_USER");
    	roleRepository.save(roleUser);
    	
    	
    	Role roleAdmin= new Role();
    	roleAdmin.setName("ROLE_ADMIN");
    	roleRepository.save(roleAdmin);
    	
    	
    	User userAdmin = new User();// this user has many roles ,manytomany relationship
    	userAdmin.setName("admin");
    	List<Role> roles = new ArrayList<Role>();
    	roles.add(roleUser);
    	roles.add(roleAdmin);
    	userAdmin.setRoles(roles);
    	userRepository.save(userAdmin);
    	
    	
    	Blog blogJavaVids = new Blog();
    	blogJavaVids.setName("javaVids");
    	blogJavaVids.setUrl("http://feeds.feedburner.com/javavids?format=xml");
    	blogJavaVids.setUser(userAdmin);
    	blogRepository.save(blogJavaVids);
    	
    	Item item1 = new Item();
    	item1.setBlog(blogJavaVids);
    	item1.setTitle("first");
    	item1.setLink("http://www.javavids.com");
    	item1.setPublishedDate(new Date());
    	
    	Item item2 = new Item();
    	item2.setBlog(blogJavaVids);
    	item2.setTitle("seconed");
    	item2.setLink("http://www.javavids.com");
    	item2.setPublishedDate(new Date());
    	
   	
    	
    }
    
	
}
