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
		/* FileSystemResource :파일 시스템의 특정 파일로부터 정보를 읽어옴
		 * InputStreamResource :InputStream으로부터 정보를 읽어옴
		 * ClassPathResource :클래스 패스(src)에 있는 자원으로부터 정보를 읽어옴
		 * UrlResource :특정 URL로부터 정보를 읽어옴
		 * ServletContextResource :웹 어플리케이션의 루트 디렉토리(webContent)를 기준으로 지정한 경로에 위치한 자원으로부터 정보를 읽어옴 
		 * */
		
		BeanFactory factory = new XmlBeanFactory(resource); //객체(Bean) 생성할 준비
		//BeanFactory : 빈 객체를 관리하고 각 빈 객체간의 의존 관계를 설정해주는 기능을 제공하는 가장 단순한 컨테이너
		//XmlBeanFactory : 외부 자원으로부터 설정 정보를 읽어와서 빈 객체를 생성함
		
		
		//ApplicationContext : BeanFactory인터페이스를 상속받은 하위 인터페이스
		//ClassPathXmlApplicationContext
		
		HelloBean bean = (HelloBean) factory.getBean("h"); //객체(Bean) 생성해서 받아오기. "h"는 xml문서의 bean id와 일치하게
		bean.sayHello("Spring");
		
	}

}
