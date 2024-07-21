package com.bruno.coursespringmongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bruno.coursespringmongo.entities.Post;

@Repository
public interface PostRepositoy extends MongoRepository<Post, String>{

	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searcTitle(String text);
	
	List<Post> findByTitleContainingIgnoreCase(String text);	
}
