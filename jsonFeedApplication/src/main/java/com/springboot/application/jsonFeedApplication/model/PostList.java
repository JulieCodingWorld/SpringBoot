package com.springboot.application.jsonFeedApplication.model;

import java.util.ArrayList;
import java.util.List;

public class PostList {
	private List<Post> posts;

	public PostList() {
		setPosts(new ArrayList<Post>());
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

}
