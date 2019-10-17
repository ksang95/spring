package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.consolution.test.aop.GreetingService;

public class GreetingTest {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("config/applicationContext.xml");
		GreetingService bean = (GreetingService)ctx.getBean("greetingTarget");
		try {
			bean.sayHello("홍길동");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bean.sayHello(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bean.sayGoodbye("홍길동");
	}

}
