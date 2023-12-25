package com.emp;

import java.sql.SQLException;

import com.connection.dbConnection;

public class cabPickups {
	
	public void cabPickDrop() throws ClassNotFoundException
	{
		try
		{
			String sql3 = "insert into cab_details values(63,'Hyderbad','Vijayawada')";
					
			dbConnection.ps=dbConnection.con.prepareStatement(sql3);
			dbConnection.ps.execute();
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}

}
