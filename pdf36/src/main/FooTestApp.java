package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.Foo;

public class FooTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("config/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Foo bean = (Foo) factory.getBean("foo");
		System.out.println(bean.out());
		
	}

}
