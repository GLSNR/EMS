package com.controller;

import java.sql.SQLException;
import java.util.*;

import com.InserData.cabPickups;
import com.InserData.dependentsDetails;
import com.InserData.empRegistrations;
import com.connection.dbConnection;
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

		
	}

}
