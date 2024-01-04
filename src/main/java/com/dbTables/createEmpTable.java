package com.dbTables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createEmpTable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		try {
			
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","raju123");
				Statement stmt = con.createStatement();
				
				if(con!=null)
				{
					//table 1
					String sql = "CREATE TABLE Employee"
							+ "(e_id INT NOT NULL,"
							+ " e_name VARCHAR(45), "
							+ "  e_desig VARCHAR(45), "
							+ "  e_mail VARCHAR(45), "
							+ "  e_phone VARCHAR(12), "
							+ "  e_manager VARCHAR(20), "
							+ "  e_status VARCHAR(10), "
							+ "  PRIMARY KEY ( e_id ));";
					stmt.executeUpdate(sql);
					
					//table 2
					String sql2 = "CREATE TABLE project_details"
							+ "(e_id INT NOT NULL,"
							+ " p_name VARCHAR(45), "
							+ " p_startdate DATE, "
							+ "  PRIMARY KEY ( e_id ));";
					stmt.executeUpdate(sql2);
					
					//table 3
					String sql3 = "CREATE TABLE cab_details"
							+ "(e_id INT NOT NULL,"
							+ " e_pickup VARCHAR(45), "
							+ " p_drop VARCHAR(45), "
							+ "  PRIMARY KEY ( e_id ));";
					stmt.executeUpdate(sql3);
					
					//table 4
					String sql4 = "CREATE TABLE dependent_details"
							+ "(e_id INT NOT NULL,"
							+ " d_name VARCHAR(45), "
							+ "  d_dob VARCHAR(45), "
							+ "  d_releationship VARCHAR(45), "
							+ "  d_aadhar_no VARCHAR(12), "
							+ "  PRIMARY KEY ( e_id ));";
					stmt.executeUpdate(sql4);
					
					
					System.out.println("Employee Table Created in the given database");
				}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
