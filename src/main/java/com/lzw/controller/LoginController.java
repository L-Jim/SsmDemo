package com.lzw.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lzw.mapper.User;
import com.lzw.mapper.UserMapper;

/*
 * 将xml数据导入数据库
 */
@Controller
@SessionAttributes(value={"username"})
@RequestMapping("/login")
public class LoginController {

	@Autowired
	UserMapper userMapper;

	
	@RequestMapping("/chack")
	public ModelAndView chackuser(User user)
	{
		User u = userMapper.selectByPrimaryKey(user.getId());
		ModelAndView mv = new ModelAndView("toLogin");
		if(u!=null&&u.getPassword().equals(user.getPassword()))
		{
			mv.addObject("username", u.getUsername());
			mv.setViewName("success");
		}
		mv.addObject("message", "用户名或密码出错！");
		System.out.println(user);
		return mv;
	}
	
}
