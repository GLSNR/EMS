package com.modifications;

import java.sql.SQLException;

import com.connection.dbConnection;
import com.controller.Main;

public class update_empDetails {
	
	public void updateEmpDels() throws ClassNotFoundException
	{
		try
		{
			
			//System.out.println("Enter your id to update details");
			int etu=Main.e_Id;
			System.out.println("Please Enter the following details");
			
			System.out.println("Enter Degsignation");
			String des=Main.sc.next();
			
			System.out.println("Enter Mail");
			String mail=Main.sc.next();
			
			System.out.println("Enter Mobile No");
			String phone=Main.sc.next();
			
			System.out.println("Enter Manager Name");
			String manager=Main.sc.next();
			
			String sql1= "update employee set e_desig=?, e_mail=?, e_phone=?, e_manager=? where e_id=?";
					
			dbConnection.ps=dbConnection.con.prepareStatement(sql1);
			
			dbConnection.ps.setString(1, des);
			dbConnection.ps.setString(2, mail);
			dbConnection.ps.setString(3, phone);
			dbConnection.ps.setString(4, manager);
			
			dbConnection.ps.setInt(5, etu);
			
			int k=dbConnection.ps.executeUpdate();
			if(k==1)
			{
				System.out.println("Data Updated Sucussfull");
			}
			else
			{
				System.out.println("Data Not Updated");
			}
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}

}
