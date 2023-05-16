package com.jhsung.springbootdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean(name = "myName")
	public String name() {
		return "jhsung";
	}

	@Bean
	public int age() {
		return 42;
	}

	@Bean
	public Person developer(String myName, int age) {
		return new Person(myName, age);
	}

}
