package com.book.dao;

import java.util.Collection;
import java.util.Set;

import com.book.bean.Book;

public interface BookDao {


	Set<Book> viewAllBooks();
	int getCartCount();
	void addBookToCart(Book book);
	void deleteBookFromCart(Book book);
	Collection<Book> viewCart();

//	void addBookToCart(int bookId);
//
//	void deleteBookFromCart(Book book);

}