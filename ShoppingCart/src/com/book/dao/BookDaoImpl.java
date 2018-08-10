package com.book.dao;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.book.bean.Book;

public class BookDaoImpl implements BookDao {
	
	public static Set<Book> books = new HashSet<>();
	public static Map<Integer,Book> cartItems = new HashMap<>();
	private int cartCount=0;
	
	Book booka=new Book(10,"fgd","ewffec","dgvetfbhr",589,1);
	Book bookb=new Book(11,"hftg","hjhg","hfghhh",589,1);
	Book bookc=new Book(12,"gbfr","tfhtr","htyrtk",589,1);
	Book bookd=new Book(13,"werd","gtrfj",",kj,",589,1);
	Book booke=new Book(14,"sdfac","dfgrre","bnmbg",589,1);
	
	/* (non-Javadoc)
	 * @see com.book.dao.BookDao#addBooksToList()
	 */
//	@Override
//	public Set<Book> addBooksToList() {
//		
//	
//		return books;
//		
//	}
	
	/* (non-Javadoc)
	 * @see com.book.dao.BookDao#viewAllBooks()
	 */
	@Override
	public Set<Book> viewAllBooks() {
		books.add(booka);
		books.add(bookb);
		books.add(bookc);
		books.add(bookd);
		books.add(booke);
		return books;
	}
	
	@Override
	public int getCartCount() {
		return cartCount;
	}
	
	@Override
	public void addBookToCart(Book book) {
		cartItems.put(book.getBookId(), book);
	}
	
	@Override
	public void deleteBookFromCart(Book book) {
		cartItems.remove(book.getBookId());
	}
	
	@Override
	public Collection<Book> viewCart() {
		return cartItems.values();
	}
	
	


}
