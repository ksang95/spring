package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.HelloBean;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource); //객체(Bean) 생성해서 줄 준비
		HelloBean bean = (HelloBean) factory.getBean("h"); //객체(Bean) 받아오기. "h"는 xml문서의 bean id와 일치하게
		bean.sayHello("Spring");
		
	}

}
