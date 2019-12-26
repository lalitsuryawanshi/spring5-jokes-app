package com.lalit.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootJokesAppApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootJokesAppApplication.class, args);

	}
}
