package com.bruno.coursespringmongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bruno.coursespringmongo.entities.Post;

@Repository
public interface PostRepositoy extends MongoRepository<Post, String>{

	List<Post> findByTitleContainingIgnoreCase(String text);	
}
