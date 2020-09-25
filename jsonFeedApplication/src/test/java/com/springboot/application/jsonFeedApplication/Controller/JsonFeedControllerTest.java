package com.springboot.application.jsonFeedApplication.Controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.springboot.application.jsonFeedApplication.controller.JsonFeedController;
import com.springboot.application.jsonFeedApplication.model.PostList;

@RunWith(MockitoJUnitRunner.class)
public class JsonFeedControllerTest {
	@InjectMocks
	JsonFeedController jsonFeedController;
     
    @Mock
    PostList postList;
     
    @Test
    public void getPostsTest() 
    {
    	
    	
    }
	
	
}
