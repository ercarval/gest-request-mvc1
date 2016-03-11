package com.guestrequest.identity.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestrequest.identity.AuthProvider;
import com.guestrequest.identity.Login;
import com.guestrequest.identity.User;
import com.guestrequest.identity.exception.UserNotFoundException;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServletController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("signin.jsp");
		dispatcher.forward(request, response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		password = (password == null) ? "" : password;
		
		Login login = new Login (username,password);
		AuthProvider provider = new AuthProvider();

		try {
			
			User user = provider.authenticate(login);
		
		} catch (UserNotFoundException e) {
			
			request.setAttribute("message", e.getMessage());
			
			doGet(request, response);
			return;
		}
		
		response.sendRedirect("index.jsp");
		
	}

}
