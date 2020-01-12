package com.ischoolbar.programmer.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ischoolbar.programmer.util.CaptchaUtil;

/**
 * Verification Code Servlet
 * @author qq928
 *
 */
public class Captcha extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4919529414762301338L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String method = request.getParameter("method");
		if("loginCapcha".equals(method)) {
			
		}
		
	}
	
	private void generateLoginCpacha(HttpServletRequest request, HttpServletResponse response) {
		CaptchaUtil cpachaUtil = new CaptchaUtil();
		String Vcode = cpachaUtil.generatorVCode();
		request.getSession().setAttribute("loginCapcha", Vcode);
	}

}
