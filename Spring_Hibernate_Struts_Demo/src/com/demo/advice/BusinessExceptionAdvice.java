package com.demo.advice;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BusinessExceptionAdvice {

	@Around("execution(* com.city.office.business.impl.*.*(..)) && (args(..,ex))") 
	public void around(JoinPoint joinPoint, Exception ex) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		Object target = joinPoint.getTarget();
		String methodName = joinPoint.getSignature().getName();
		
		System.out.println(df.format(new Date()) + " 业务类:" + target + " 方法:" + methodName + " 异常原因:" + ex.getMessage());
		System.out.println("a");
	}
	
}
