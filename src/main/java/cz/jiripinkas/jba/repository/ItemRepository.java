package cz.jiripinkas.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.jiripinkas.jba.entity.Item;

//Role is the enitity and Integer is the primary key
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
