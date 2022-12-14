package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	TestController testController;

	@Test
	void contextLoads() {
	}

	@Test
	void shouldConfirmTestVersion() {
		String actual = testController.sayHello();
		Assertions.assertEquals("Hallo, ich bin die Testversion", actual);
	}

}
