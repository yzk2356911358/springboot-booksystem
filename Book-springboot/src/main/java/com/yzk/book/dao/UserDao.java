package com.yzk.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yzk.book.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
