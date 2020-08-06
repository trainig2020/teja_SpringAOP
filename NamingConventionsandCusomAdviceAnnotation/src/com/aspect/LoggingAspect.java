package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.model.Circle;

@Aspect
public class LoggingAspect {
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint) {
	
	
	}
	@AfterReturning(pointcut="args(name)",returning="returnString")
	public void StringArgument(String name,Object returnString) {
		System.out.println("string arguments has been called.value"+ name+"the output value is"+returnString);
	}
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void exceptionAdvice(String name,Exception ex) {
		System.out.println("an excepion has been thrown"+ex);
	}
	@Around("@annotaiobn(com.aspect.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint ) {
		Object returnValue=null;
		try {
			System.out.println("before advice");
			returnValue=	proceedingJoinPoint.proceed();
			System.out.println("after returning");
		} catch (Throwable e) {
			System.out.println("after throwing");
		}
		System.out.println("after finally");
		return returnValue;
		
	}
	
	
	
	@Pointcut("execution(* get*())")
	public void allGetters() {
		
	}
	
	@Pointcut("within(com.model.Circle)")
	public void allCircleMethods() {
		
	}

}
