package com.bruno.coursespringmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bruno.coursespringmongo.entities.User;

@Repository
public interface UserRepositoy extends MongoRepository<User, String>{
	
}
