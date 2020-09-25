package com.springboot.application.jsonFeedApplication.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.application.jsonFeedApplication.model.Post;

@Service
public class JsonFeedServiceImpl implements JsonFeedService{
	
	private static List<Post> postLists = new ArrayList<Post>();
	private static Set<Integer> userSet = new HashSet<Integer>();
	   
	@Override
	public List<Post> getAllPost() {
		final String url = "http://jsonplaceholder.typicode.com/posts";
		RestTemplate restTemplate = new RestTemplate();
		Post[] result = restTemplate.getForObject(url, Post[].class);
		postLists = Arrays.asList(result);	
		return postLists;
	}
	
	@Override
	public int countAllUsers() {
		for(Post currPost: postLists) {
			userSet.add(currPost.getUserId());
		}
		return userSet.size();
	}
	
	@Override
	public List<Post> updatePostListsByRank(int rank) {
		Post updatePost = postLists.get(rank - 1);
		updatePost.setBody("1800Flowers");
		updatePost.setTitle("1800Flowers");
		return postLists;	
	}
}
