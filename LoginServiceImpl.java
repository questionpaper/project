package com.cts.loginapp.service;

import com.cts.loginapp.dao.LoginDAO;
import com.cts.loginapp.dao.LoginDAOImpl;
import com.cts.loginapp.model.LoginBean;

public class LoginServiceImpl implements LoginService{

	LoginDAO loginDAO = new LoginDAOImpl();
	public boolean validateUser(LoginBean bean) {
		// TODO Auto-generated method stub
		System.out.println(" Service called");
		return loginDAO.validateUser(bean);
	}

}
 