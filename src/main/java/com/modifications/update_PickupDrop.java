package com.modifications;

import java.sql.SQLException;

import com.connection.dbConnection;
import com.controller.Main;

public class update_PickupDrop {
	
	public void updatePickupDropDels() throws ClassNotFoundException
	{
		try
		{
			
			//System.out.println("Enter your id to update pick up & drop details");
			int etu=Main.e_Id;
			System.out.println("Please Enter the following details");
			
			System.out.println("Enter Pickup point");
			String pick=Main.sc.next();
			
			System.out.println("Enter Drop point");
			String drop=Main.sc.next();
			
			String sql4= "update cab_details set e_pickup=?, e_drop=? where e_id=?";
					
			dbConnection.ps=dbConnection.con.prepareStatement(sql4);
			
			dbConnection.ps.setString(1, pick);
			dbConnection.ps.setString(2, drop);
			dbConnection.ps.setInt(3, etu);
			
			int k=dbConnection.ps.executeUpdate();
			if(k==1)
			{
				System.out.println("Pick up & Drop Updated Sucussfull");
			}
			else
			{
				System.out.println("Pickup & Drop Not Updated");
			}
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}


}
