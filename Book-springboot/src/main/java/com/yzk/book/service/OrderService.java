package com.yzk.book.service;

import java.util.List;

import com.yzk.book.model.Orders;

public interface OrderService {
	void add(Orders order);

	void del(int id);

	void up(Orders temp);

	void useruporder(int id);

	List<Orders> findall();

	List<Orders> findbyuname(String name);

	Orders getbyid(int id);
}
