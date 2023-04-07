package com.dal.view;

import java.util.Scanner;
import java.io.*;
import com.dal.controller.*;
import com.dal.exception.*;

import com.dal.controller.EmployeeController;
//import com.dal.model.Employee;




public class MainClass {

	public static void main(String[] args) throws IOException {
try {
	String uname=null;
	String pwd = null;
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println("Enter Username:");
	uname=br.readLine();
	System.out.println("Enter password:");
	pwd= br.readLine();

	if(uname.equals("deeps") && pwd.equals("pass"))
	{
		System.out.println("Welcome " + uname);
		System.out.println("Welcome");
		EmployeeController ec = new EmployeeController();
		//EmployeeInterface ec = new EmployeeController();
		Scanner sc = new Scanner(System.in);
		String choice = null;
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Serialize");
			System.out.println("4. Deserialize");
			System.out.println("5. Sort Emp by ID");
			System.out.println("6. Sort by Emp name");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				ec.addEmployee();
				break;
			}

			case 2: {
				ec.viewEmployee();
				break;
			}
			case 3:
			{
				ec.serialize();
				break;
			}
			case 4:
			{
				ec.deserialize();
				break;
			}
			case 5: {
				ec.sortByEid();
				break;
			}
			case 6: {
				ec.sortByEname();
				break;
			}
			default: {
				System.out.println("Enter right choice");
				break;
			}
			}
			System.out.println("Do u want to continue Y or y");

			choice = sc.next();

		} while (choice.equals("Y") || choice.equals("y"));
		System.out.println("Exited");
		System.exit(0);
	}
	else{
		throw new com.dal.exception.UserException();
	}
	
}
catch(com.dal.exception.UserException unf)
{
	System.out.println(unf);
}
		

	}

}
