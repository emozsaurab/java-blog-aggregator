package cz.jiripinkas.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.jiripinkas.jba.entity.User;

//Role is the enitity and Integer is the primary key
public interface UserRepository extends JpaRepository<User, Integer> {

}
