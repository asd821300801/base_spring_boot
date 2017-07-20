package com.lingdu.user.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.lingdu.user.domain.UserVO;
import com.lingdu.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserService service;
	
	
	/**
	 * http://localhost/user/get.action
	 * @return JSON数据
	 */
	@RequestMapping("/get")
	public @ResponseBody List<UserVO> get(){
		logger.debug("\n------->get.action");
		List<UserVO> userList = service.findAll();
		logger.debug("--->" + userList + "\n");
		return userList;
	}
	
	
	/**
	 * http://localhost/user/index.action
	 * @param map 
	 * @return index.jsp
	 */
	@RequestMapping("/index")
	public String index(ModelMap map){
		logger.debug("\n------->index.action");
		map.addAttribute("message", service.findAll());
		return "index";
	}
}
