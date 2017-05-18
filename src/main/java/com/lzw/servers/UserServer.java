package com.lzw.servers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzw.mapper.User;
import com.lzw.mapper.UserMapper;

@Service
public class UserServer {
	@Autowired
	UserMapper userMapper;
	public PageInfo getuser(Integer i)
	{
		
		PageHelper.startPage(i, 3);

		List<User> users= userMapper.selectAll();
		PageInfo<User> page = new PageInfo<User> (users);
		
		return page;
		
	}
}
