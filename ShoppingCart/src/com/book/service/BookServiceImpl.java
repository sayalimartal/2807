package com.book.service;


import java.util.Set;

import com.book.bean.Book;
import com.book.dao.BookDaoImpl;

public class BookServiceImpl implements BookService {
	
	BookDaoImpl dao = new BookDaoImpl();
	
	/* (non-Javadoc)
	 * @see com.book.service.BookService#viewAllBooks()
	 */
	@Override
	public Set<Book> viewAllBooks() {
		Set<Book> books = (Set<Book>) dao.viewAllBooks(); 
		return books;
	}
	
	
	/* (non-Javadoc)
	 * @see com.book.service.BookService#addBook(com.book.bean.Book)
	 */
	@Override
	public void addBookToCart(int bookId) {
		dao.addBookToCart(bookId);
	}
	
	/* (non-Javadoc)
	 * @see com.book.service.BookService#deleteBook(com.book.bean.Book)
	 */
	@Override
	public void deleteBookFromCart(Book book) {
		dao.deleteBookFromCart(book);
	}

}
