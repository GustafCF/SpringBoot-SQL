package com.aula.bancosql.domain.resourcies;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.bancosql.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1, "Bananinha", "marihuyla@gmail.com", "982560072", "0451");
		return ResponseEntity.ok().body(u);
	}
}
