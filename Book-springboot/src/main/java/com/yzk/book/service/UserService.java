package com.yzk.book.service;

import java.util.List;

import com.yzk.book.model.User;

public interface UserService {
	void add(User user);

	void del(int id);

	void up(User temp);

	List<User> findall();

	User findbyusername(String username);

	boolean login(String username, String password);
}
