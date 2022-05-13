package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "mindgate123";
		String driver = "oracle.jdbc.driver.OracleDriver";
		int resultCount;
		String sqlQuery;
		Connection connection;
//		Statement statement;
		PreparedStatement preparedStatement;
		ResultSet resultSet;
//		System.out.println(" Insert Example");
//
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			sqlQuery = "INSERT INTO employee_details(name, salary) VALUES(?, ?)";
//			preparedStatement = connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "Pradip");
//			preparedStatement.setDouble(2, 40033);
//			resultCount = preparedStatement.executeUpdate();
//			connection.close();
//			if (resultCount > 0) {
//				System.out.println("Record inserted successfully");
//			} else
//				System.out.println("recor not insert");
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}
//		System.out.println("Upadate example");
//		try {
//			Class.forName(driver);
//			connection= DriverManager.getConnection(url, user, password);
//			sqlQuery= "Update employee_details set name= ?,salary= ? where employee_id= 1";
//			preparedStatement= connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "Yogesh");
//			preparedStatement.setDouble(2, 42003);
//			resultCount= preparedStatement.executeUpdate();
//			connection.close();
//			if(resultCount>0) {
//				System.out.println("Record update successfully");
//			}
//			else
//				System.out.println("recor not update");
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//			
//		}
//		System.out.println("delete example");
//		try {
//			Class.forName(driver);
//			connection= DriverManager.getConnection(url, user, password);
//			sqlQuery= "delete employee_details  where employee_id= ?";
//			preparedStatement = connection.prepareStatement(sqlQuery);
//			preparedStatement.setInt(1, 6);
//			resultCount= preparedStatement.executeUpdate();
//			connection.close();
//			if(resultCount>0) {
//				System.out.println("Record Delete successfully");
//			}
//			else
//				System.out.println("recor not delete");
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//			
//		}
		System.out.println("select example");
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			sqlQuery = "select * from employee_details";
			preparedStatement = connection.prepareStatement(sqlQuery);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("employee_id") + "  |  " + resultSet.getString("name") + "  |  "
						+ resultSet.getDouble("Salary"));
				System.out.println("-".repeat(50));
			}
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}

	}
}
