package com.InserData;

import java.sql.SQLException;

import com.connection.dbConnection;

public class empRegistrations {
	
	public void addEmp()
	{
		try
		{
			String sql = "insert into employee values(63,'Vamshi','Architech','vamshi@gmail.com','876572838','siva','active')";
					
			dbConnection.ps=dbConnection.con.prepareStatement(sql);
			dbConnection.ps.execute();
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}

}
