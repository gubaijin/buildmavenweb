package com.spring.demo.mvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.demo.mybatis.dao.UserMapper;
import com.spring.demo.mybatis.model.User;

/**
 * Created by ehsy_it on 2016/6/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-*.xml"})
public class MainTest extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void getAge(){
		//通过name查询user对象
		User user = userMapper.selectByPrimaryKey("li");
		System.out.println(user.getAge());
	}

}
