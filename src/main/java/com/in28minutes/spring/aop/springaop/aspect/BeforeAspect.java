package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import com.in28minutes.spring.aop.springaop.SpringAopApplication;

@Aspect
@Configuration
public class BeforeAspect {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringAopApplication.class);
	
	@Before("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	public void before() {
		LOGGER.info("Intercepted Call");
	}
}
