package com.springboot.application.jsonFeedApplication.Service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class JsonFeedServiceImplTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void getAllPostTest(){

		RequestBuilder request = MockMvcRequestBuilders
				.get("/")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				//.andExpect(status().isOk())
				//.andExpect(content().string("Hello World"))
				.andReturn();
	}
}
