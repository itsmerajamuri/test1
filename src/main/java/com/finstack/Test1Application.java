package com.finstack;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Test1Application {
	
	@Bean
	public ModelMapper getmodelmapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

}
