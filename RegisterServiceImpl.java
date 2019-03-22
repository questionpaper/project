package com.cts.loginapp.service;


import com.cts.loginapp.dao.RegisterDAOImpl;
import com.cts.loginapp.dao.registerDAO;
import com.cts.loginapp.model.registerBean;



	public class RegisterServiceImpl implements RegisterService
{

		registerDAO RegisterDAO = new RegisterDAOImpl();
		public boolean RegisterUser(registerBean bean) {
			return RegisterDAO.RegisterUser(bean);
		}
	}
