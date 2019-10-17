package com.bit.jdbc.dao;

import org.apache.ibatis.annotations.Param;

import com.bit.jdbc.vo.Emp;

public interface EmpMapper {
	Emp selectEmp(@Param("en") int empno); // empno를 en으로 이름변경해서 사용
}
