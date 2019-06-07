package com.booksotre.repository;

import org.springframework.data.repository.CrudRepository;

import com.booksotre.domain.User;

public interface UserRepository extends CrudRepository<User, Long>
{
	User findByUsername(String username);

}
