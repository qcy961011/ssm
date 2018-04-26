package com.service;

import java.util.List;

import com.entity.User;

public interface UserService {

	public User get(int id);

	public List<User> getAll();

	public int save(User user);

	public int updateUser(User user);
}
