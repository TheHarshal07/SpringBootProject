package com.example.SpringDemo.aop;

import org.slf4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	
	//return type, class-name.methode-name(args)
	
	@Before("execution(* com.example.SpringDemo.Service.UserService.addUser(..))")
	public void logMethodeCall(JoinPoint jp)
	{
		LOGGER.info("Methode Called " + jp.getSignature().getName());
	}
	
	@After("execution(* com.example.SpringDemo.Service.UserService.addUser(..))")
	public void logMethodeExecute(JoinPoint jp)
	{
		LOGGER.info("Methode Excuted "+ jp.getSignature().getName());
	}
	
	@AfterThrowing("execution(* com.example.SpringDemo.Service.UserService.viewAlluser(..))")
	public void methodeException(JoinPoint jp)
	{
		LOGGER.info("Methode giving issues " + jp.getSignature().getName() );
	}
	
	@AfterReturning("execution(* com.example.SpringDemo.Service.UserService.viewAlluser(..))")
	public void methodeExceted(JoinPoint jp)
	{
		LOGGER.info("Methode executed successfully " + jp.getSignature().getName());
	}
}
