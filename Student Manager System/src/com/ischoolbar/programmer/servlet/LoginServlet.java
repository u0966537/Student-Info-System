package com.ischoolbar.programmer.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ischoolbar.programmer.util.StringUtil;

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
		String actual_vcode = request.getParameter("vcode");
		String expected_vcode = request.getSession().getAttribute("loginCaptcha").toString();
		if(! StringUtil.isEmpty(actual_vcode) && actual_vcode.toLowerCase().equals(expected_vcode.toLowerCase())) {
			
		}
		else {
			response.getWriter().write("vcodeError");
			return;
		}

	}

}
