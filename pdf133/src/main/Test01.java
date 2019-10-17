package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserDAO;
import vo.User;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("config/applicationContext.xml");
		UserDAO dao=(UserDAO) context.getBean("userDao2");
		List<User> list=dao.findUserList();
		list.forEach(i->System.out.println(i));
	}

}
