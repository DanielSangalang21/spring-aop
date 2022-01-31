package com.in28minutes.spring.aop.springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.aop.springaop.business.Business1;
import com.in28minutes.spring.aop.springaop.business.Business2;

@Configuration
@ComponentScan
public class SpringAopApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringAopApplication.class);
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringAopApplication.class);
		
		Business1 business1 = applicationContext.getBean(Business1.class);
		Business2 business2 = applicationContext.getBean(Business2.class);
		
		LOGGER.info(" -> {}",business1.calculateSomething());
		LOGGER.info(" -> {}",business2.calculateSomething());
		//business1.calculateSomething();
		
	}

}
