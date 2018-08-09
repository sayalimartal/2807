package com.book.dao;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.book.bean.Book;

public class BookDaoImpl implements BookDao {
	
	Set<Book> books = new HashSet<>();
	public static Map<Integer, Book> booksInCart = new HashMap<>();
	
	Book booka=new Book(10,"fgd","ewffec","dgvetfbhr",589);
	Book bookb=new Book(11,"hftg","hjhg","hfghhh",589);
	Book bookc=new Book(12,"gbfr","tfhtr","htyrtk",589);
	Book bookd=new Book(13,"werd","gtrfj",",kj,",589);
	Book booke=new Book(14,"sdfac","dfgrre","bnmbg",589);
	
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
	
	/* (non-Javadoc)
	 * @see com.book.dao.BookDao#addBook(com.book.bean.Book)
	 */
	@Override
	public void addBookToCart(int bookId) {
		
		books.stream().forEach(book -> { if(book.getBookId() == bookId) booksInCart.put(book.getBookId(), book);
		});
	}

	
	/* (non-Javadoc)
	 * @see com.book.dao.BookDao#deleteBook(com.book.bean.Book)
	 */
	@Override
	public void deleteBookFromCart(Book book) {
		booksInCart.remove(book);
	}


}
