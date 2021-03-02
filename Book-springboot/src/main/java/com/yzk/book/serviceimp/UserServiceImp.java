package com.yzk.book.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzk.book.dao.UserDao;
import com.yzk.book.model.User;
import com.yzk.book.service.UserService;

@Service("UserServiceImp")
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userdao;

	@Override
	public void add(User user) {
		userdao.save(user);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(User temp) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> findall() {
		return userdao.findAll();
	}

	@Override
	public boolean login(String username, String password) {
		for (User user : userdao.findAll()) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}

		}
		return false;
	}

	@Override
	public User findbyusername(String username) {
		for (User user : userdao.findAll()) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}

}
