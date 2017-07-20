package com;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.lingdu.user.domain.UserVO;

import com.lingdu.user.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseSpringBootApplicationTests {

	@Autowired
	private UserService service;
	
	@Test
	public void contextLoads() {
	}
	@Test
	public void find(){
		
		List<UserVO> userList = service.findAll();
		for (UserVO userVO : userList) {
			System.out.println(userVO);
		}
	}
}
