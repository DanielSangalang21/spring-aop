package com.in28minutes.spring.aop.springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.aop.springaop.business.Business1;
import com.in28minutes.spring.aop.springaop.business.Business2;
public class SpringAopApplicationXML {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringAopApplicationXML.class);
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("ApplicationContextXML.xml");
		
		Business1 business1 = applicationContext.getBean(Business1.class);
		Business2 business2 = applicationContext.getBean(Business2.class);
		
		LOGGER.info(" -> {}",business1.calculateSomething());
		LOGGER.info(" -> {}",business2.calculateSomething());
		//business1.calculateSomething();
		
	}

}
