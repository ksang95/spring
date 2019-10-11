package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import x.y.HelloBean;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=new ClassPathXmlApplicationContext("config/applicationContext.xml");
		//ApplicationContext : BeanFactory 인터페이스를 상속받은 하위 인터페이스 . Resource로의 액세스 수단 간편화
		//ClassPathXmlApplicationContext : 구현
		
		HelloBean bean = (HelloBean) factory.getBean("h");
		bean.sayHello("Spring");
		
	}

}
