package com.book.bean;

public class Book {
	
	private String bookName;
	private String authorName;
	private String description;
	private int price;
	private int bookId;
	private int bookCount;

	public Book(int bookId, String bookName, String authorName, String description, int price, int bookCount) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.description = description;
		this.price = price;
		this.bookId = bookId;
		this.bookCount = bookCount;
	}


	public String getBookName() {
		return bookName;
	}


	public String getAuthorName() {
		return authorName;
	}


	public String getDescription() {
		return description;
	}


	public int getPrice() {
		return price;
	}

	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	

	public int getBookCount() {
		return bookCount;
	}


	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}


	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", description=" + description + ", price="
				+ price + ", bookId=" + bookId + ", bookCount=" + bookCount + "]";
	}


	

}
