package com.bruno.coursespringmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.bruno.coursespringmongo.entities.User;
import com.bruno.coursespringmongo.repositories.UserRepositoy;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepositoy userRepositoy;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepositoy.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepositoy.saveAll(Arrays.asList(maria, alex, bob));
	}

}
