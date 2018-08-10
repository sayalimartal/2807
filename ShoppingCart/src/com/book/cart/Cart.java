package com.book.cart;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.book.bean.Book;
import com.book.dao.BookDaoImpl;

public class Cart {
	
	public static Map<Integer,Book> cartItems = new HashMap<>();
	private int cartCount=0;
	BookDaoImpl dao = new BookDaoImpl();
	
	
	public int getCartCount() {
		return cartCount;
	}


	public void addBookToCart(int bookId) {
		boolean flag=true;
		cartCount++;
		
		for(Book  book: cartItems.values())
		{
		if(book.getBookId() == bookId) {
			book.setBookCount(book.getBookCount()+1);
			flag=false;
			break;
		}
		}
		if(flag)
			BookDaoImpl.books.stream().forEach(book -> { if(book.getBookId() == bookId) cartItems.put(book.getBookId(), book);});
	}
	
	public void deleteBookFromCart(int bookId) {
		cartCount--;
		for(Book  book: viewCart())
		{
		if(book.getBookId() == bookId) 
		{
			if(book.getBookCount()==1)
				cartItems.remove(book.getBookId());
			if(book.getBookCount()>1) {
				book.setBookCount(book.getBookCount()-1);
			}
			
			break;
		}
		}
	}
	
	public Collection<Book> viewCart() {
		return cartItems.values();
	}

}
