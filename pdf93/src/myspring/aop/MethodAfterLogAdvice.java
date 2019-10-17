package myspring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MethodAfterLogAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("[Log]METHOD After : "+method.getName()+" on "+target+" called");
	}
	
}
