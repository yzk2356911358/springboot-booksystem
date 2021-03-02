package com.yzk.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yzk.book.model.Book;

public interface BookDao extends JpaRepository<Book, Integer> {

}
