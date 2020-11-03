package com.zc.springboot01_quick;

import com.zc.springboot01_quick.beans.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01QuickApplicationTests {

	@Autowired
	private Person person;

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
