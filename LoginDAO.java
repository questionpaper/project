package com.cts.loginapp.dao;

import com.cts.loginapp.model.LoginBean;

public interface LoginDAO {
	
	public boolean validateUser(LoginBean bean);

}
