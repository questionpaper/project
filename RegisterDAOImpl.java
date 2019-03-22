package com.cts.loginapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.loginapp.model.registerBean;
import com.cts.loginapp.util.DBUtils;

public class RegisterDAOImpl implements registerDAO
{
	public boolean registerUser(registerBean bean) {
		// TODO Auto-generated method stub
		Connection connection = null;
		String query = "insert into students values(?,?,?,?,?,?)";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		
		try {
			connection = DBUtils.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bean.getEmployeeId());
			preparedStatement.setString(2, bean.getFirstname());
			preparedStatement.setString(3, bean.getLastName());
			preparedStatement.setString(4, bean.getEmail());
			preparedStatement.setString(5, bean.getPassword());
			preparedStatement.setString(6, bean.getConfirm_Password());
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtils.closeConnection(connection);
		}
		
		return false;
	}

	public boolean RegisterUser(registerBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

}


