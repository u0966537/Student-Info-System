package com.ischoolbar.programmer.servlet;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ischoolbar.programmer.util.CaptchaUtil;

/**
 * Verification Code Servlet
 * @author qq928
 *
 */
public class CaptchaServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4919529414762301338L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String method = request.getParameter("method");
		if("loginCaptcha".equals(method)) {
			this.generateLoginCpacha(request, response);
			return;
		}
		else {
			response.getWriter().write("error method");
		}
		
	}
	
	private void generateLoginCpacha(HttpServletRequest request, HttpServletResponse response) throws IOException {
		CaptchaUtil captcha = new CaptchaUtil();
		String Vcode = captcha.generatorVCode();
		request.getSession().setAttribute("loginCaptcha", Vcode);
		BufferedImage VcodeImage = captcha.generatorRotateVCodeImage(Vcode, true);
		ImageIO.write(VcodeImage, "gif", response.getOutputStream());
	}

}
