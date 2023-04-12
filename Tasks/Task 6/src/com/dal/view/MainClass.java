package com.dal.view;


import java.util.Scanner;

import com.dal.controller.EmployeeController;
import com.dal.controller.EmployeeInterface;
import com.dal.model.Employee;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Welcome");
		EmployeeInterface ec = new EmployeeController();
		Scanner sc = new Scanner(System.in);
		String choice = null;
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Serialize Emplist");
			System.out.println("4. Deserialize Emplist");
			System.out.println("5. Sort Emp by ID");
			System.out.println("6. Sort by Emp name");
			System.out.println("7. Update Employee");
			System.out.println("8. Delete Employee");
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
			case 3: {
				ec.serializeEmp();
				break;
			}
			
			case 4: {
				ec.deserializeEmp();
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
			case 7: {
				ec.updateEmployee();
				break;
			}
			case 8: {
				ec.deleteEmployee();
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

}
