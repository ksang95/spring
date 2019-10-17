package com.bit.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bit.jdbc.dao.EmpMapper;
import com.bit.jdbc.vo.Emp;

@Component
public class MyComponent {
	@Autowired
	private EmpMapper empMapper;
	
	public void selectEmpResult(int empno) {
		Emp emp=empMapper.selectEmp(empno);
		System.out.println("사원명: "+emp.getEname()+" mgr: "+emp.getMgr());
	}
}
