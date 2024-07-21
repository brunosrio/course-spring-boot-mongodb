package com.bruno.coursespringmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.coursespringmongo.entities.User;
import com.bruno.coursespringmongo.repositories.UserRepositoy;

@Service
public class UserService {
	
	@Autowired
	private UserRepositoy repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
