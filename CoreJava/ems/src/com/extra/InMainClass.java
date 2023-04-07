package com.extra;

 class Emp 
{
	int empid = 123;
	String empname = "Arun";
	final int y = 100;
	
	public String getDetails() {
		return empid + empname ;
	}
}



class Manager extends Emp
{
	String dept = "Developer";
	public String getDetails() {
		return empid + empname + dept;
	
	}
public class InMainClass {
	public static void main (String[] args)
	{
		Emp em = new Emp();
		System.out.println(em.getDetails());
		
		Manager mgr = new Manager();
		System.out.println(mgr.getDetails());
		
		
		
		
	}
	}
}


