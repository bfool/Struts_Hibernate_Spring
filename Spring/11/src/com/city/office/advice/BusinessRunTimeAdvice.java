package com.city.office.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BusinessRunTimeAdvice {
	private long startTime = 0;
	private long endTime = 0;
	
	@Before("execution(* com.city.office.business.impl.*.*(..))")  
    public void before(JoinPoint joinPoint){  
		startTime = System.currentTimeMillis();
    }
	
	@AfterReturning("execution(* com.city.office.business.impl.*.*(..))")
	public void after(JoinPoint joinPoint) {
		endTime = System.currentTimeMillis();
		long time = endTime - startTime;
        System.out.println(joinPoint.getSignature().getName() + "方法运行时间是" + time + "毫秒");  
	}
	
}