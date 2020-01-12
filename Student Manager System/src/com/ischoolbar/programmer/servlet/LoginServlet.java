package com.ischoolbar.programmer.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User Login Servlet 
 * @author qq928
 *
 */
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4650468749491688889L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String vcode = request.getParameter("vcode");
		
		response.getWriter().write("Hello");
	}

}
