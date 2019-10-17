package com.consolution.test.aop;

public class GreetingServiceImpl implements GreetingService {

	private String greeting;
	
	public void setGreeting(String greeting) {
		this.greeting=greeting;
	}
	@Override
	public void sayHello(String name) throws Exception {
		if(name==null)
			throw new Exception();
		System.out.println("sayHello : "+greeting+":"+name);
	}

	@Override
	public void sayGoodbye(String name) {
		System.out.println("sayGoodbye : "+greeting+":"+name);
	}
	
}
