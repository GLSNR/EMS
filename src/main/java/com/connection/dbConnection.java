package com.connection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class dbConnection {
	
	public static PreparedStatement ps=null;
	public static Connection con = null;
	
	public void Conection() throws ClassNotFoundException
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anji","root","raju123");
			
			if(con!=null)
			{
				System.out.println("Connected");
			}
			else
			{
				System.out.println("Not Connected");
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}

}
