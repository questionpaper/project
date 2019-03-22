package com.cts.loginapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.loginapp.model.registerBean;
import com.cts.loginapp.service.RegisterService;
import com.cts.loginapp.service.RegisterServiceImpl;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RegisterServlet() {
        super();
   
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegisterService registerService = new RegisterServiceImpl();
		registerBean bean = new registerBean();
		bean.setEmployeeId(request.getParameter("EmployeeId"));
		bean.setFirstname(request.getParameter("FirstName"));
		bean.setLastName(request.getParameter("LastName"));
		bean.setEmail(request.getParameter("Email"));
		bean.setPassword(request.getParameter("Password"));
		bean.setConfirm_Password(request.getParameter("Confirm_Password"));
		System.out.println("in servlet"+bean);
		RequestDispatcher dispatcher = null;
		
		if(registerService.RegisterUser(bean)) {
			System.out.println("true");
		dispatcher = request.getRequestDispatcher("register.jsp");
		dispatcher.forward(request, response);
		}
		else {
			System.out.println("false");
			dispatcher=request.getRequestDispatcher("loginPage.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}

