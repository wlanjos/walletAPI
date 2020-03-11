package com.wallet.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wallet.entity.User;
import com.wallet.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class UserControllerTest {

	private static final String EMAIL = "email@teste.com";
	private static final String NAME = "User Test";
	private static final String PASSWORD = "123456";
	private static final String URL = "/user";
	
	
	
	@MockBean
	UserService service;
	
	@Autowired
	MockMvc mvc;
	
	public void testSave() {
		 /*mvc.perform(MockMvcRequestBuilders.post(URL).content(getJsonPayload())
				 .contentType(MediaType.APPLICATION_JSON)
				 .ac))*/
	}
	
	public User getMockUser() {
		User u = new User();
		u.setEmail(EMAIL);
		u.setName(NAME);
		u.setPassword(PASSWORD);
		
		return u;
	}
	
	public String getJsonPayload() {
		UserDTO  dto = new UserDTO();
		dto.setEmail(EMAIL);
		dto.setName(NAME);
		dto.setPassword(PASSWORD);
		
		ObjectMapper mapper = new ObjectMapper();
		
	}
	
	
	
	
	
	
	
	
	
	
}
