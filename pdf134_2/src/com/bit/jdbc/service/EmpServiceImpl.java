package com.bit.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bit.jdbc.dao.EmpMapper;
import com.bit.jdbc.dto.Emp;

@Service("empService2")
public class EmpServiceImpl {
	
	@Autowired
	private EmpMapper empDao;
	

	
	public Emp selectEmp(int empno) {
		Emp emp =empDao.selectEmp(empno); 
		return emp;
	}

}
