package com.cts.loginapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.loginapp.model.LoginBean;
import com.cts.loginapp.service.LoginService;
import com.cts.loginapp.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginService loginService = new LoginServiceImpl();

		LoginBean bean = new LoginBean();
		bean.setUserName(request.getParameter("userName"));
		bean.setPassword(request.getParameter("password"));
		
		System.out.println("in servlet"+bean.getPassword()+bean.getPassword());
		RequestDispatcher dispatcher = null;
		
		if(loginService.validateUser(bean)) {
			System.out.println("true");
		dispatcher = request.getRequestDispatcher("AdminFrame.jsp");
		dispatcher.forward(request, response);
		}
		else {
			System.out.println("false");
			dispatcher=request.getRequestDispatcher("loginPage.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
