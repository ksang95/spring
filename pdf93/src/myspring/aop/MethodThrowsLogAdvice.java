package myspring.aop;

import org.springframework.aop.ThrowsAdvice;

public class MethodThrowsLogAdvice implements ThrowsAdvice {
	public void afterThrowing(Exception e) {
		System.out.println("예외 발생 ");
	}
}
