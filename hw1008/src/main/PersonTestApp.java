package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.Student;
import x.y.Teacher;


public class PersonTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource= new ClassPathResource("config/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Student student = (Student) factory.getBean("student");
		Teacher teacher = (Teacher) factory.getBean("teacher");
		student.print();
		teacher.print();
	}

}
