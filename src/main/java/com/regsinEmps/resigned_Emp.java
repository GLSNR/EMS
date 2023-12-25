package com.regsinEmps;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.dbConnection;
import com.controller.Main;

public class resigned_Emp {
	
	public void resinedEmpoyees() throws ClassNotFoundException, SQLException
	{
		
		try
		{
			String sql11= "update employee set e_status=? where e_id=?";
			
			dbConnection.ps=dbConnection.con.prepareStatement(sql11);
			
			dbConnection.ps.setString(1, "resigned");
			dbConnection.ps.setInt(2, Main.e_Id);
			int reg= dbConnection.ps.executeUpdate();
			if(reg==1)
			{
				System.out.println("You are sucussfully regsined");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}








//String sql10 = "select * from employee where e_id=?";
//
//
//dbConnection.ps=dbConnection.con.prepareStatement(sql10);
//dbConnection.ps.setInt(1, Main.e_Id);
//
//ResultSet rs= dbConnection.ps.executeQuery();
//
//	
//String sql11= "insert into resign_emps values(?,?,?,?,?,?)";
//		
////String sql11= "insert into resign_emps(e_id,e_name,e_desig,e_mail,e_phone,e_manager) values(?,?,?,?,?,?)";		
//	
//dbConnection.ps=dbConnection.con.prepareStatement(sql11);
//while(rs.next())
//{
//dbConnection.ps.setInt(1, rs.getInt(1));
//dbConnection.ps.setString(2, rs.getString(2));
//dbConnection.ps.setString(3, rs.getString(3));
//dbConnection.ps.setString(4, rs.getString(4));
//dbConnection.ps.setString(5, rs.getString(5));
//dbConnection.ps.setString(6, rs.getString(6));
//}
//dbConnection.ps.execute();
//
////Deleting emp record form employee table;
//String sql12= "delete from employee where e_id=?";
//dbConnection.ps=dbConnection.con.prepareStatement(sql12);
//dbConnection.ps.setInt(1, Main.e_Id);
//int deleted=dbConnection.ps.executeUpdate();
//
//if(deleted==1)
//{
//	System.out.println("Employee Resigned Sucussfully");
//}
//
//}
//catch(SQLException e)
//{
//	System.out.println(e);
//}
//
