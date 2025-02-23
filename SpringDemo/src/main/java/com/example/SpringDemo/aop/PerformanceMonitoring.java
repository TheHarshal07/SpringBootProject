package com.example.SpringDemo.aop;

import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.SpringDemo.Entity.User;


@Component
@Aspect
public class PerformanceMonitoring {

	private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitoring.class);
	
	//logging the methode execution time 
	@Around("execution(* com.example.SpringDemo.Service.UserService.viewAlluser(..))")
	public List<User> monitoringTime(ProceedingJoinPoint jp) throws Throwable
	{
		Long start = System.currentTimeMillis();
		
		List<User> user = (List<User>) jp.proceed();
		
		Long end = System.currentTimeMillis();
		
		LOGGER.info("Time taken "+ (end-start + " ms"));
		
		return user;
	}
}
