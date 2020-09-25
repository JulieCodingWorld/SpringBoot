package com.springboot.application.jsonFeedApplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.application.jsonFeedApplication.service.JsonFeedService;

@RestController
public class JsonFeedController {

	
	@Autowired
	JsonFeedService jsonFeedService;
	
	 @RequestMapping(value = "/")
	   public ResponseEntity<Object> getPosts() {
	      return new ResponseEntity<>(jsonFeedService.getAllPost(), HttpStatus.OK);
	   }
	 
	@RequestMapping("/countUsers") //get
	public ResponseEntity<Object> countUser() {
		return new ResponseEntity<>("The number of unique user Ids in JSON file is : " + jsonFeedService.countAllUsers(), HttpStatus.OK);	
	}
	
	@RequestMapping(value = "/updateUser/{id}", method = RequestMethod.PUT) 
	public ResponseEntity<Object> updateUser(@PathVariable("id") int id) {
		return new ResponseEntity<>(jsonFeedService.updatePostListsByRank(id), HttpStatus.OK);	
	}
	
}
