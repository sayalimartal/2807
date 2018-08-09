package com.book.dao;

import java.util.Set;

import com.book.bean.Book;

public interface BookDao {


	Set<Book> viewAllBooks();

	void addBookToCart(int bookId);

	void deleteBookFromCart(Book book);

}