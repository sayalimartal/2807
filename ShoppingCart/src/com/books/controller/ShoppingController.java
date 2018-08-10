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
import com.book.cart.Cart;
import com.book.service.BookService;
import com.book.service.BookServiceImpl;

/**
 * Servlet implementation class ShoppingController
 */
@WebServlet("*.app")
public class ShoppingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookService service = new BookServiceImpl();
	Cart cart = new Cart();
	
       
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
		System.out.println(action);
		HttpSession session = request.getSession();
		session = request.getSession();
		session.setAttribute("cartCount", cart.getCartCount());
		session.setAttribute("cartItems", cart.viewCart());
		
		switch (action) {
		case "/add.app":
			String bookId=request.getParameter("bookId");
			cart.addBookToCart(Integer.parseInt(bookId));
			
			System.out.println(Cart.cartItems);
			response.sendRedirect("refresh.app");
//			request.setAttribute("booksInCart", booksInCart);
//			RequestDispatcher dispatcher = request.getRequestDispatcher("cart.jsp");
//			dispatcher.forward(request, response);
			break;
		case "/refresh.app":
			Set<Book> books = service.viewAllBooks();
			request.setAttribute("books", books);
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
			break;
		case "/viewcart.app":
//			Collection<Book> cartItems = cart.viewCart();
//			request.setAttribute("cartItems", cartItems);
//			int cartCount=cart.getCartCount();
//			System.out.println(cartItems.size());
//			cartItems.stream().forEach(System.out::println);
			
//			session.setAttribute("cartCount", cartCount);
//			session.setAttribute("cartItems", cartItems);
//			dispatcher = request.getRequestDispatcher("cartdetails.jsp");
//			dispatcher.forward(request, response);
			//session = request.getSession();
			System.out.println("HIIII");
			response.sendRedirect("cartdetails.jsp");
			System.out.println("********");
			break;
		case "/remove.app":
			bookId=request.getParameter("bookId");
			cart.deleteBookFromCart(Integer.parseInt(bookId));
			System.out.println(Cart.cartItems);
			response.sendRedirect("viewcart.app");
//			request.setAttribute("booksInCart", booksInCart);
//			RequestDispatcher dispatcher = request.getRequestDispatcher("cart.jsp");
//			dispatcher.forward(request, response);
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
