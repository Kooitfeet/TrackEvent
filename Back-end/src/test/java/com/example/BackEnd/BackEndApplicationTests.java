package com.example.BackEnd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackEndApplicationTests {

	@Test
	void contextLoads(String[] args) {
		SpringApplication.run(BackEndApplication.class, args);
	}

}