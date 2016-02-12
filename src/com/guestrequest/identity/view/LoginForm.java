package com.guestrequest.identity.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginForm() {
        super();
    }

	protected void doGet(HttpServletRequest request
					, HttpServletResponse response) 
									throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("  <body>");
		out.println("   <h1>" + request.getRemoteAddr() + "</h1>");
		out.println("   <h1>" + request.getContentType() + "</h1>");
		out.println("   <h1>" + request.getLocalName() + "</h1>");
		out.println("   <h1>" + request.getLocalPort() + "</h1>");
		out.println("  </body>");
		out.println("</html>");
		out.flush();
		out.close();
		
	}

	

}
