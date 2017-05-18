package com.lzw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.lzw.mapper.User;
import com.lzw.mapper.UserMapper;
import com.lzw.servers.UserServer;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServer userServer;
	
	@RequestMapping("/getuser")
	public ModelAndView getuser(Integer i)
	{
		ModelAndView mv = new ModelAndView("success");
		PageInfo page= userServer.getuser(i);
//		List<User> users= page.getList();
		mv.addObject("page",page);
//		mv.addObject("users",users);
		return mv;
		
	}
}
