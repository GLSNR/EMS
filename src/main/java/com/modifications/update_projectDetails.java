package com.modifications;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
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
			
			//performing string manipluations on user given date.
			String[] dateParts = p_DOB.split("-");
			String year = dateParts[0]; 
			String month = dateParts[1]; 
			//conveting string to int;
			int y1=Integer.parseInt(year);
			int m1=Integer.parseInt(month);
			

			//query for select date form project table
			String sql8= "select p_statdate from projcet_details where e_id=?";
			dbConnection.ps=dbConnection.con.prepareStatement(sql8);
			dbConnection.ps.setInt(1, Main.e_Id);
			ResultSet rs = dbConnection.ps.executeQuery();
			
			rs.next();
			String db_date=rs.getString(1);
			String[] dateParts2 = p_DOB.split("-");
			String year2 = dateParts2[0]; 
			String month2 = dateParts2[1]; 
			//conveting string to int;
			int y2=Integer.parseInt(year2);
			int m2=Integer.parseInt(month2);
			
			int r1=0,r2=0,q=0;
			if(y1>y2)
			{
				//storing year difference
				r1=y1-y2;
			}
			else
			{
				//storing year difference
				r2=m1-m2;
			}
				
			if(r2<0)
			{
				//if r2 is -ve changing it to positve.
				r2=-(r2);
			}
			
			if(r1>1)
			{
				q++;
			}
			else if(r2>6)
			{
				q++;
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


















////initilizing java method to get system calender
//java.util.Date currDate = Calendar.getInstance().getTime();

////Storing year value from db
//int y1=check1.getYear();

////Storing year value of system
//int y2=currDate.getYear();
////It will check the current year is grater than 
//if(y2>y1)
//{
//	//checking year differce
//   int r1=y2-y1;
//}
//else
//{
//	System.out.println("Please enter a valid year");
//    System.exit(0);
//}
//

////Storing month values from db
//int m1=check1.getMonth();

////storing month value form current date
//int m2= currDate.getMonth()+1;
////checking month difference
//int r2=m2-m1;
//if(r2<0)
//{
//	//if r2 is -ve changing it to positve.
//	r2=-(r2);
//}
//
////declaring a varible for executing query based on its count.
//int q=0;
//
//
//if(r1>1)
//{
//	q++;
//}
//else if(r2>6)
//{
//	q++;
//}


