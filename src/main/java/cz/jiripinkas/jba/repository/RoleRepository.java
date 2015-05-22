package cz.jiripinkas.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.jiripinkas.jba.entity.Role;

//Role is the enitity and Integer is the primary key
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
