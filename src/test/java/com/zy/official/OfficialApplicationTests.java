package com.zy.official;

import com.zy.official.dao.dataobject.User;
import com.zy.official.dao.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class OfficialApplicationTests {

	@Resource
	UserMapper userMapper;

	@Test
	void contextLoads() {
	}

	@Test
	public void testInit() {
		User byId = userMapper.getById();
		System.out.println(byId);
	}

}
