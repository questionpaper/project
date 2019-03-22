package com.cts.loginapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.loginapp.model.LoginBean;
import com.cts.loginapp.util.DBUtils;

public class LoginDAOImpl implements LoginDAO{

	public boolean validateUser(LoginBean bean) {
		Connection connection = null;
		String query = "select username, password from login where username=? and password=?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
		try {
			connection = DBUtils.getConnection();
			System.out.println("Connection"+connection);
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bean.getUserName());
			preparedStatement.setString(2, bean.getPassword());
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				System.out.println(" User found");
				return true;
			}
			
			else
				{
				System.out.println(" User not found");
				return false;
				}
		} catch (SQLException e) {
						e.printStackTrace();
		}
		finally {
			DBUtils.closeConnection(connection);
		}
		
		return false;
	}

}
