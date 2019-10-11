package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.People;

public class PersonTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("config/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		People people1 = (People) factory.getBean("people");
		People people2 = (People) factory.getBean("people");
		people1.print();
		System.out.println(people1);
		System.out.println(people2);
	}

}
