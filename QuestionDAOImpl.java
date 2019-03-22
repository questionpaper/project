package com.cts.loginapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.loginapp.model.Question;
import com.cts.loginapp.util.DBUtils;



public class QuestionDAOImpl implements QuestionDAO{

	public boolean addUser(Question question) {
		// TODO Auto-generated method stub
		Connection connection = null;
		String query = "insert into question values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		
		try {
			connection = DBUtils.getConnection();
			System.out.println("Connection:"+connection);
			
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, question.getQuestion());
			preparedStatement.setString(2, question.getOption1());
			preparedStatement.setString(3, question.getOption2());
			preparedStatement.setString(4, question.getOption3());
			preparedStatement.setString(5, question.getOption4());
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
}



