package com.bruno.coursespringmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.bruno.coursespringmongo.entities.Post;
import com.bruno.coursespringmongo.entities.User;
import com.bruno.coursespringmongo.repositories.PostRepositoy;
import com.bruno.coursespringmongo.repositories.UserRepositoy;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepositoy userRepositoy;
	
	@Autowired
	private PostRepositoy postRepositoy;
	
	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepositoy.deleteAll();
		postRepositoy.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paula, abraços!", maria);
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", maria);
		
		userRepositoy.saveAll(Arrays.asList(maria, alex, bob));
		postRepositoy.saveAll(Arrays.asList(post1, post2));
		
	}

}
