package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import x.y.Foo;

public class FooTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		for (int i = 0; i < 10; i++) {
			Foo bean = (Foo) factory.getBean("foo");
			System.out.println(bean.getBarAndBazStr());
		}
		
		ClassPathXmlApplicationContext fac=(ClassPathXmlApplicationContext) factory;
		//fac.registerShutdownHook();
		Foo bean = (Foo) fac.getBean("foo");
		System.out.println(fac.isActive());
		fac.close();
		System.out.println(fac.isActive());
		System.out.println(bean.getBarAndBazStr());
		//Foo bean1=(Foo)fac.getBean("foo");
		//System.out.println(bean1);
		//fac.destroy();
		//fac.close();
		//보통 Spring Application에서는 destroy() 동작시키지 못하고 어플리케이션이 종료 되어버리는 경우가 있다. 이런 경우 applciatonContext.close()나 .destroy()를 호출시켜 주는 방법과 .registerShutdownHook() 호출 방법으로 해결 가능하다.
	}

}
