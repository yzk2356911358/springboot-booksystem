package com.yzk.book.service;

import java.util.List;

import com.yzk.book.model.Classify;


public interface ClassifyService {
	void add(Classify classify);

	void del(int id);

	void up(Classify temp);

	List<Classify> findall();
}
