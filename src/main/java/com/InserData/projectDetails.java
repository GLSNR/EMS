package com.InserData;

import java.sql.SQLException;

import com.connection.dbConnection;

public class projectDetails {

	public static void main(String args[]) throws ClassNotFoundException
	{
		// TODO Auto-generated method stub
		try
		{
			String sql = "insert into project_details values(63,'Vodafone','2015-12-01')";
					
			dbConnection.ps=dbConnection.con.prepareStatement(sql);
			dbConnection.ps.execute();
			
		}
		catch(SQLException e)
		
		{
			System.out.println(e);
		}

	}

}
