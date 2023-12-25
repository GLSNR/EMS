package com.emp;

import java.sql.SQLException;

import com.connection.dbConnection;

public class dependentsDetails {
	
	public void addDependents() throws ClassNotFoundException
	{
		try
		{
			String sql = "insert into dependent_details values(63,'VamshiDady','1977-01-09','father','89625385748')";
					
			dbConnection.ps=dbConnection.con.prepareStatement(sql);
			dbConnection.ps.execute();
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
}
