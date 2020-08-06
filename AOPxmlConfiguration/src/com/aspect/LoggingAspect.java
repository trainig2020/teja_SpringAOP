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


public class LoggingAspect {
	
	
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
	
	
	

	
	


}
