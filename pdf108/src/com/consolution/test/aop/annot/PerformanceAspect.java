package com.consolution.test.aop.annot;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PerformanceAspect {
	
	@Pointcut("execution(public * com.consolution.test.aop..*sayHello(..))")
	private void profileTarget() {}
	
	@Around("profileTarget()")
	public Object trace(ProceedingJoinPoint joinPoint)throws Throwable{
		Signature s=joinPoint.getSignature();
		String methodName=s.getName();
		long startTime=System.nanoTime();
		System.out.println("[Log]METHOD Before : "+methodName+" time check start");
		Object obj=null;
		try {
			obj=joinPoint.proceed();
		} catch (Exception e) {
			System.out.println("[Log}METHOD error : "+methodName);
		}
		long endTime=System.nanoTime();
		System.out.println("[Log]METHOD After : "+methodName+" time check end");
		System.out.println("[Log] "+methodName+" Processing time is "+(endTime-startTime)+"ns");
		return obj;
	}
}
