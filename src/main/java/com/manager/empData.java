package com.manager;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.dbConnection;
import com.controller.Main;

public class empData {
	
	public void showEmp() throws ClassNotFoundException
	{
		try
		{
			int k=0;
			System.out.println("Enter Your Name to show employess under you");
			String manName=Main.sc.next();

			String sql6 = "select * from employee where e_manager=?";
			
			
			dbConnection.ps=dbConnection.con.prepareStatement(sql6);
			dbConnection.ps.setString(1, manName);
			
			ResultSet rs= dbConnection.ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
				k++;
			}
			
			if(k==0)
			{
				System.out.println("No employees under "+manName);
			}
			
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}

}
