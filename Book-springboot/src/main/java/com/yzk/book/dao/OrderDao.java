package com.yzk.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yzk.book.model.Orders;

public interface OrderDao extends JpaRepository<Orders, Integer> {

}
