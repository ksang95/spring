package com.bit.jdbc.dao;

import java.util.List;

import com.bit.jdbc.vo.User;

public interface UserDAO {
	public List<User> findUserList();
}
