package com.dal.controller;

import java.util.Scanner;
import java.io.*;
import java.util.*;


import com.dal.model.Employee;

public class EmployeeController implements EmployeeInterface {
	Employee emp;
	List emplist = new ArrayList();
	public void addEmployee() throws IOException
	{	
		emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eid");
		int eid= sc.nextInt();
		emp.setEid(eid);
		
		System.out.println("Enter Ename");
		String ename= sc.next();
		emp.setEname(ename);
		emplist.add(emp);
		//serialize(eid, ename);
		System.out.println("Employee Added Succesfully");
	}
	
	public void viewEmployee() {
		Iterator i = emplist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		//System.out.println(emp);
	}
}
	
	public void serialize() throws IOException
	{
		try{
	
		FileOutputStream fos = new FileOutputStream("dedalus.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emplist);
		System.out.println("Serialized to file dedalus.txt");
		oos.close();
		fos.close();
		}
		catch(FileNotFoundException FNF)
		{
			System.out.println("No File Found");
		}
	}
	
	public void deserialize()  throws IOException
	{
		try
		{
		FileInputStream fis = new FileInputStream("dedalus.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		emplist = (ArrayList)ois.readObject();
		System.out.println("DeSerialized from file dedalus.txt");
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		ois.close();
		fis.close();
		}
		catch(FileNotFoundException FNF)
		{
			System.out.println("No File Found");
		}
		catch(ClassNotFoundException CNF)
		{
			System.out.println("No Class Found");
		}
	}
	
	@Override
	public void sortByEid() {
		Collections.sort(emplist);
		System.out.println("After sorting by EID");
		System.out.println(emplist);
	}

	@Override
	public void sortByEname() {
		Collections.sort(emplist, Employee.NameComparator);
		System.out.println(emplist);
		
	}
	
	
	
}
