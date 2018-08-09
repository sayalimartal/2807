package com.books.controller;

import java.io.IOException;
import java.util.Collection;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.book.bean.Book;
import com.book.dao.BookDaoImpl;
import com.book.service.BookService;
import com.book.service.BookServiceImpl;

/**
 * Servlet implementation class ShoppingController
 */
@WebServlet("*.app")
public class ShoppingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookService service = new BookServiceImpl();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingController() {
        super();
        }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		//HttpSession session = request.getSession();
		
		
		
		switch (action) {
		case "/add.app":
			String bookId=request.getParameter("bookId");
			service.addBookToCart(Integer.parseInt(bookId));
			System.out.println(BookDaoImpl.booksInCart);
			
			request.setAttribute("booksInCart", booksInCart);
			RequestDispatcher dispatcher = request.getRequestDispatcher("cart.jsp");
			dispatcher.forward(request, response);
			break;
		case "/refresh.app":
			Set<Book> books = service.viewAllBooks();
			request.setAttribute("books", books);
			dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
			break;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
