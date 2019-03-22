package com.cts.loginapp.dao;

import com.cts.loginapp.model.LoginBean;

public class Main {

	public static void main(String[] args) {
		LoginDAO dao = new LoginDAOImpl();
		LoginBean bean = new LoginBean();
		bean.setUserName("shree");
		bean.setPassword("abhi");
		System.out.println(dao.validateUser(bean));
	}
}
