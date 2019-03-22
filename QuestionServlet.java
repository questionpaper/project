package com.cts.loginapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.loginapp.model.LoginBean;
import com.cts.loginapp.model.Question;
import com.cts.loginapp.service.LoginService;
import com.cts.loginapp.service.LoginServiceImpl;
import com.cts.loginapp.service.QuestionService;
import com.cts.loginapp.service.QuestionServiceImpl;

/**
 * Servlet implementation class QuestionServlet
 */
@WebServlet("/QuestionServlet")
public class QuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public QuestionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		QuestionService questionService = new QuestionServiceImpl();
		Question question = new Question();
		question.setQuestion(request.getParameter("question"));
		question.setOption1(request.getParameter("option1"));
		question.setOption2(request.getParameter("option2"));
		question.setOption3(request.getParameter("option3"));
		question.setOption4(request.getParameter("option4"));
		
		
		System.out.println("in servlet"+question);
		RequestDispatcher dispatcher = null;
		/*
		if(loginService.validateUser(bean)) {
			System.out.println("true");
		dispatcher = request.getRequestDispatcher("userHomePage.jsp");
		dispatcher.forward(request, response);
		}
		else {
			System.out.println("false");
			dispatcher=request.getRequestDispatcher("loginPage.jsp");
			dispatcher.forward(request, response);
		}*/
		
	}

}
