package com.yzk.book.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzk.book.dao.BookDao;
import com.yzk.book.model.Book;
import com.yzk.book.service.BookService;

@Service("BookServiceImp")
public class BookServiceImp implements BookService {
	@Autowired
	private BookDao bookdao;

	@Override
	public void add(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Book temp) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Book> findall() {
		return bookdao.findAll();
	}

	@Override
	public List<Book> findbyclassify(String classify) {
		List<Book> books = new ArrayList<>();
		for (Book book : bookdao.findAll()) {
			if (book.getClassify().equals(classify)) {
				books.add(book);
			}
		}
		return books;
	}

	@Override
	public Book getbyid(int id) {
		// TODO Auto-generated method stub
		return bookdao.getOne(id);
	}

}
