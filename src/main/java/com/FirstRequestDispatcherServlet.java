package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class FirstRequestDispatcherServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("uname");
		
		String password = req.getParameter("pwd");
		
		if(username.equals("delhi")&& password.equals("123")) {
			RequestDispatcher rd = req.getRequestDispatcher("success.html");
			rd.forward(req, resp);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("error.html");
			rd.forward(req, resp);
		}
		
	}
}
