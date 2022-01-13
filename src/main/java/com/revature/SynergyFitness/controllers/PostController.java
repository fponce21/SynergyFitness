package com.revature.SynergyFitness.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.SynergyFitness.Beans.Post;
import com.revature.SynergyFitness.Beans.Users;
import com.revature.SynergyFitness.services.TrainerService;
import com.revature.SynergyFitness.services.UserService;



@RestController // basically puts @ResponseBody over ALL methods - no returning views
@RequestMapping(path="/posts") // all requests starting with /pets come to this controller
@CrossOrigin(origins="http://localhost:4200") // accepts requests from angular
public class PostController {

	// field injection
		@Autowired
		private UserService userServ;
		@Autowired
		private TrainerService trainServ;
		
		@GetMapping
		public ResponseEntity<Set<Users>> getPosts() {
			
			Set<Users> availablePosts = userServ.viewTrainers();
			return ResponseEntity.ok(availablePosts);
			//return ResponseEntity.status(HttpStatus.OK).body(availablePets);
		}
		
	
		
		@PostMapping
		public ResponseEntity<Void> addPost(@RequestBody Post newPost) {
			
			
			if (newPost !=null) {
				trainServ.addPost(newPost);
				return ResponseEntity.status(HttpStatus.CREATED).build();
			}
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
		@GetMapping(path="/{postId}")
		public ResponseEntity<Post> getPetById(@PathVariable int postId) {
			
			Post post = userServ.getPostById(postId);
			if (post != null)
				return ResponseEntity.ok(post);
			else
				return ResponseEntity.notFound().build();
		}
		
		
		
		
}
