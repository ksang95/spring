package com.bit.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.bit.jdbc.vo.User;

public class UserDAOImpl2 extends JdbcDaoSupport implements UserDAO {
	@Override
	public List<User> findUserList(){
		String sql="SELECT userid,password,name,email FROM userinfo";
		UserRowMapper rowMapper = new UserRowMapper();
		List<User> userList=getJdbcTemplate().query(sql,rowMapper);
		return userList;
	}
}
