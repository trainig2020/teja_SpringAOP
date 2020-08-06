package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.model.Circle;

@Aspect
public class LoggingAspect {
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint) {
	
	
	}
	@Before("args(name)")
	public void StringArgument(String name) {
		System.out.println("string arguments has been called.value"+ name);
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {
		
	}
	@Pointcut("within(com.model.Circle)")
	public void allCircleMethods() {
		
	}

}
