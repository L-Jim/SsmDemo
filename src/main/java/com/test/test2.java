package com.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lzw.mapper.User;
import com.lzw.mapper.UserMapper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test2 {
	
	@Autowired
	private UserMapper um;
	@Test
	public void getUser()
	{
		List<User>ll= um.selectAll();
		for (User l:ll)
		{
			System.out.println(l);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac= new FileSystemXmlApplicationContext("classpath:applicationContext.xml");

		test2 t=new test2();
		t.getUser();
//		System.out.println(u);
		return ;

	}

}
