package com.dal.model;

import java.io.Serializable;
import java.util.Comparator;

//POJO -= Plain Old Java Object
public class Employee implements Serializable,Comparable<Employee>{

private int eid;
private String ename;

public Employee(){
System.out.println("Constructor");	
}

public Employee(int eid, String ename){
this.eid = eid;
this.ename = ename;
}

public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	
	public int compareTo(Employee e) {
		
		return this.eid - e.eid;
	
	}
	
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			//return e1.getEid() -e2.getEid();
			return e1.getEname().compareTo(e2.getEname());
		}
	
	
	};

	
	
	

}









