package com.modifications;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.connection.dbConnection;
import com.controller.Main;

public class update_projectDetails {
	
	public void updateProjectDels() throws ClassNotFoundException
	{
		try
		{
			 
			System.out.println("Please Enter the following details");
			
			System.out.println("Enter New Project Name");
			String p_name=Main.sc.next();
			
			System.out.println("Enter Project Starting Date in YYYY-MM-DD");
			String p_DOB=Main.sc.next();
			
			//query for select date form project table
			String sql8= "select p_statdate from projcet_details where e_id=?";
			dbConnection.ps=dbConnection.con.prepareStatement(sql8);
			dbConnection.ps.setInt(1, Main.e_Id);
			ResultSet rs = dbConnection.ps.executeQuery();
			
			rs.next();
			String db_date=rs.getString(1);
			String[] dateParts2 = db_date.split("-");
			String year2 = dateParts2[0]; 
			String month2 = dateParts2[1]; 
			//conveting string to int;
			int y1=Integer.parseInt(year2);
			int m1=Integer.parseInt(month2);
			
			//performing string manipluations on user given date.
			String[] dateParts = p_DOB.split("-");
			String year = dateParts[0]; 
			String month = dateParts[1]; 
			//conveting string to int;
			int y2=Integer.parseInt(year);
			int m2=Integer.parseInt(month);
			

			
			int q=0,a=0,b=0;
			if(y2-y1>=2)
			{
				q++;
			}
			else if(y2-y1==1)
			{
				a=12-m1;
				b=a+m2;
				if(b>=6)
				{
					q++;
				}
			}
			else if(y1-y2==0)
			{
				if(m1>m2)
				{
					b=m1-m2;
				}
				else
				{
					b=m2-m1;
				}
				if(b>=6)
				{
					q++;
				}
			}
			
			
			
			//if loop for executing query
			if(q==1)
			{
				String sql9= "update projcet_details set p_name=?, p_statdate=? where e_id=?";
				dbConnection.ps=dbConnection.con.prepareStatement(sql9);
				
				dbConnection.ps.setString(1, p_name);
				dbConnection.ps.setString(2, p_DOB);
				dbConnection.ps.setInt(3, Main.e_Id);
				
				dbConnection.ps.executeUpdate();
				System.out.println("Project details updated sucussfully");
				q=0;

			}
			else
			{
				System.out.println("6 Months not completed in the existing project");
			}
			
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}


}
