package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.jdbc.MyComponent;
import com.bit.jdbc.dao.EmpMapper;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("config/myBatisAppContext.xml");
		//DriverManagerDataSource ds=(DriverManagerDataSource) context.getBean("dataSource");
		MyComponent component=(MyComponent)context.getBean("myComponent"); //여러 mapper 통해 serviceImpl 여러 개 만들어질 때 service로 다형성 이용 가능, 받은 데이터를 처리할 부분이 필요할 때 service쪽에서.
		component.selectEmpResult(7902);
		EmpMapper empMapper=(EmpMapper)context.getBean("empMapper");
		System.out.println(empMapper.selectEmp(7902));
	}

}
