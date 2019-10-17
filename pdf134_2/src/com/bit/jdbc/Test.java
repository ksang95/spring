package com.bit.jdbc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.jdbc.dao.EmpMapper;
import com.bit.jdbc.service.EmpServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("config/myBatisAppContext.xml");
		//ctx.getBean("dataSource");
		
	//	EmpMapper mapper 
		EmpServiceImpl service = ((EmpServiceImpl)ctx.getBean("empService2"));
		
		System.out.println(service.selectEmp(7499));

		EmpMapper mapper=((EmpMapper)ctx.getBean("empMapper"));
		System.out.println(mapper.selectEmp(7499));
	}

}








