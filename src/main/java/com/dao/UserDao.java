package com.dao;



import java.util.List;

import com.entity.User;


public interface UserDao {
	
	/**
	 * 根据ID 获取User
	 * @param id
	 * @return
	 */
	public User get(int id) ;
	
	public List<User> getAll() ;
	
	public int save(User user);
	
	public int updateUser(User user);
}
