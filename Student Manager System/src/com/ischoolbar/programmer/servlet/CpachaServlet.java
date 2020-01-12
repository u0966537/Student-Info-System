package com.ischoolbar.programmer.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Verification Code Servlet
 * @author qq928
 *
 */
public class CpachaServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4919529414762301338L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

		
	}

}
