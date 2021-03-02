package com.yzk.book.serviceimp;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzk.book.dao.OrderDao;
import com.yzk.book.model.Orders;
import com.yzk.book.service.OrderService;

@Service("OrderServiceImp")
public class OrderServiceImp implements OrderService {
	@Autowired
	private OrderDao orderdao;

	@Override
	public void add(Orders order) {
		order.setState("未归还");
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
		String date3 = df3.format(new Date());
		DateFormat df7 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINA);
		String time3 = df7.format(new Date());
		order.setBtime(date3 + " " + time3);
		orderdao.save(order);
	}

	@Override
	public void del(int id) {
		orderdao.delete(orderdao.getOne(id));
	}

	@Override
	public void up(Orders temp) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Orders> findall() {
		return orderdao.findAll();
	}

	@Override
	public Orders getbyid(int id) {
		return orderdao.getOne(id);
	}

	@Override
	public List<Orders> findbyuname(String name) {
		List<Orders> orders = new ArrayList<>();
		for (Orders temp : orderdao.findAll()) {
			if (temp.getUname().equals(name)) {
				orders.add(temp);
			}
		}
		return orders;
	}

	@Override
	public void useruporder(int id) {
		Orders order = orderdao.getOne(id);
		order.setState("已归还");
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
		String date3 = df3.format(new Date());
		DateFormat df7 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINA);
		String time3 = df7.format(new Date());
		order.setFtime(date3 + " " + time3);
		orderdao.save(order);
	}

}
