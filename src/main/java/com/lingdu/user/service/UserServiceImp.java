package com.lingdu.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lingdu.user.dao.UserVOMapper;
import com.lingdu.user.domain.UserVO;
import com.lingdu.user.domain.UserVOExample;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserVOMapper mapper;
	
	@Override
	public List<UserVO> findAll() {
		UserVOExample example = new UserVOExample();
		example.createCriteria().andIdIsNotNull();
		return mapper.selectByExample(example);
	}
}
