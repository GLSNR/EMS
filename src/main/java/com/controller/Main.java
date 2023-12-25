package com.controller;

import java.sql.SQLException;
import java.util.*;

import com.connection.dbConnection;
import com.emp.cabPickups;
import com.emp.dependentsDetails;
import com.emp.empRegistrations;
import com.manager.empData;
import com.modifications.update_DependentsDetails;
import com.modifications.update_PickupDrop;
import com.modifications.update_empDetails;
import com.switchControl.employeeSwitch;
import com.switchControl.managerSwitch;

public class Main {

	//declaring 
	public static int e_Id=0;
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		int exit=0;
		
		dbConnection dbC= new dbConnection();
		dbC.Conection();
		
		
		System.out.println("Welcome to ABC Company");
		System.out.println("....Hello User....");
		System.out.println("1.Manager Access \n2.Employee Access");
		System.out.println("Choose one option to continue");
		int n=sc.nextInt();
		
	
		
	    switch(n)
		{
			case 1: managerSwitch mS = new managerSwitch();
			mS.managerControl();
			break;
			     
			case 2: employeeSwitch eS = new employeeSwitch();
			eS.empControl();
			break;
			     
			default: System.out.println("Choose an valid option");
			break;
		}

		
		
		
		

		//For employees registration.
//		empRegistrations eR= new empRegistrations();
//		eR.addEmp();
		
		
		
		//for adding nomines
//		dependentsDetails dd= new dependentsDetails();
//		dd.addDependents();
		
		
		
		//for adding cab pickup and drop up points
//		cabPickups cP= new cabPickups();
//		cP.cabPickDrop();
		
		//for updating cap pickup and drop points
//		update_PickupDrop uPD= new update_PickupDrop();
//		uPD.updatePickupDropDels();
		
		
		
		
	}

}
