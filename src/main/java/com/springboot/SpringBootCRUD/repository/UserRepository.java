package com.springboot.SpringBootCRUD.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.SpringBootCRUD.entity.User;


// @Repository : will be automatically done when Spring sees EXTENDS CrudRepository
public interface UserRepository extends CrudRepository<User, Integer> {
}
