package com.modifications;

import java.sql.SQLException;

import com.connection.dbConnection;
import com.controller.Main;

public class update_DependentsDetails {
	
	public void updateDependentDels() throws ClassNotFoundException
	{
		try
		{
			
			///System.out.println("Enter your id to update dependent details");
			int etu=Main.e_Id;
			System.out.println("Please Enter the following details");
			
			System.out.println("Enter dependent name");
			String dName=Main.sc.next();
			
			System.out.println("Enter dependent DOB in format YYYY-MM-DD");
			String dDOB=Main.sc.next();
			
			System.out.println("Enter dependent relationship");
			String dRel=Main.sc.next();
			
			System.out.println("Enter dependent aadhar no");
			String dAadhar=Main.sc.next();
			
			String sql2= "update dependent_details set d_name=?, d_dob=?, d_releationship=?, d_aadhar_no=? where e_id=?";
					
			dbConnection.ps=dbConnection.con.prepareStatement(sql2);
			
			dbConnection.ps.setString(1, dName);
			dbConnection.ps.setString(2, dDOB);
			dbConnection.ps.setString(3, dRel);
			dbConnection.ps.setString(4, dAadhar);
			dbConnection.ps.setInt(5, etu);
			
			
			int k=dbConnection.ps.executeUpdate();
			if(k==1)
			{
				System.out.println("Dependent Data Updated Sucussfull");
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
