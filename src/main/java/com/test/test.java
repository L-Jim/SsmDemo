package com.test;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lzw.mapper.User;
import com.lzw.mapper.UserMapper;




public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		System.out.println(sqlSessionFactory);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userif=sqlSession.getMapper(UserMapper.class);
		User user = userif.selectByPrimaryKey(1);
		System.out.println(user);
		sqlSession.close();
		return ;
	}

}
