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
	}

}
