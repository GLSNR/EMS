package com.switchControl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.dbConnection;
import com.controller.Main;
import com.modifications.update_DependentsDetails;
import com.modifications.update_PickupDrop;
import com.modifications.update_empDetails;
import com.modifications.update_projectDetails;
import com.regsinEmps.resigned_Emp;

public class employeeSwitch {
	
	public void empControl() throws ClassNotFoundException, SQLException
	{
		System.out.println("Enter you Id to continue");
		Main.e_Id= Main.sc.nextInt();
		
		String sql12="select e_status from employee where e_id=?";
		dbConnection.ps=dbConnection.con.prepareStatement(sql12);
		dbConnection.ps.setInt(1, Main.e_Id);
		ResultSet rs1= dbConnection.ps.executeQuery();
		rs1.next();
		
		if(rs1.getString(1).equals("resigned"))
		{
			System.out.println("You are not the part of the organization\nYou don't have access");
			System.exit(0);
		}
		
			
		String sql7 = "select e_name from employee where e_id=?";
		
		dbConnection.ps=dbConnection.con.prepareStatement(sql7);
		dbConnection.ps.setInt(1, Main.e_Id);
		
		ResultSet rs= dbConnection.ps.executeQuery();
		
		//rs.next() movies courser pointer from heading to first_row;
		rs.next();
		
	    
		
	    int exit=0;
	    while(exit!=1)
	    {
	    
	    System.out.println("Welcome User..."+rs.getString(1));
	    	
	    System.out.println("1. Update Personal Details");
	    System.out.println("2. Update Dependent Details");
	    System.out.println("3. Update Cab/Commute Details");
	    System.out.println("4. Update Project Details");
	    System.out.println("5. Regsin from company");
	    System.out.println("6. Press 6 to exit");
	    
	    int eSelect= Main.sc.nextInt();
	    switch (eSelect) 
	    {
	    	//for updating employees data.
			case 1:  update_empDetails uD= new update_empDetails();
					 uD.updateEmpDels();
					 break;

			//for updating dependent details
			case 2:  update_DependentsDetails uDD= new update_DependentsDetails();
					 uDD.updateDependentDels();
					 break;
			
			//for updating cap pickup and drop points
			case 3:	 update_PickupDrop uPD= new update_PickupDrop();
					 uPD.updatePickupDropDels();
					 break;
			
			//for updating project details
			case 4: update_projectDetails uP = new update_projectDetails();
					 uP.updateProjectDels();
					 break;

			//employee regsignation
			case 5: resigned_Emp rE= new resigned_Emp();
				  	rE.resinedEmpoyees();
				  	break;
				  	  	
			case 6: exit++;
					System.out.println("Logout sucussfull");
				    break;
			
			default: System.out.println("Invalid choice");
					 break;
		}
	    
	    }//while
	    
		
	}

}
