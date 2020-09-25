package com.springboot.application.jsonFeedApplication.service;

import java.util.List;

import com.springboot.application.jsonFeedApplication.model.Post;

public interface JsonFeedService {
	public abstract List<Post> getAllPost();
	public abstract int countAllUsers();
	public abstract List<Post> updatePostListsByRank(int rank);
}
