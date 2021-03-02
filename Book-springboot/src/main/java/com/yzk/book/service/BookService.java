package com.yzk.book.service;

import java.util.List;

import com.yzk.book.model.Book;

public interface BookService {
	void add(Book book);

	void del(int id);

	void up(Book temp);

	List<Book> findall();

	List<Book> findbyclassify(String classify);
	Book getbyid(int id);
}
