package com.cts.loginapp.service;

import com.cts.loginapp.dao.QuestionDAOImpl;
import com.cts.loginapp.model.Question;
import com.cts.loginapp.model.Question;
import com.cts.loginapp.dao.QuestionDAO;




public class QuestionServiceImpl implements QuestionService
{

	QuestionDAO questionDAO = new QuestionDAOImpl();
	public boolean addUser(Question bean) {
	
		return questionDAO.addUser(bean);
	}
	

}


