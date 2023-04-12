package com.extra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmpStream {

	public static void main(String[] args) {
		Employee[] emparr = {
				new Employee("Sachin","Tendulkar", "IT", 50000),
				new Employee("Amir", "Khan", "HR", 45000),
				new Employee("MS","Dhoni","Sales", 60000),
				new Employee("Virat","Koli","Sales",55000),
				new Employee("Yuvaraj", "Singh", "IT",35000)				
		};
	
		
		List<Employee> empList = Arrays.asList(emparr);
		System.out.println(empList);
		
		boolean  result =empList.stream().anyMatch(emp->emp.getDept().matches("IT"));
		if(result)
		{
			System.out.println("Employees available");
		}
		else
		{
			System.out.println("Employees NOT available");
		}
		
		Predicate<Employee> p1=em ->(em.getSalary() >40000 && em.getSalary()<60000);
		empList.stream()
		.filter(p1)
		.sorted(Comparator.comparing(Employee::getFname))
		.forEach(System.out::println);
		
		
	    System.out.println(empList.stream().filter(p1).findFirst().get());
		
		/*
		IT
		  sac
		  amir
		Sales
		   MSD
		   VK
		 HR
		   Amir*/
	    
	    System.out.println("-----------------------------------------------------------");
	    Map<String,List<Employee>> groupByDept = empList.stream()
	    		.collect(Collectors.groupingBy(Employee::getDept));
		System.out.println(groupByDept);
		
		groupByDept.forEach((dep,empInDept)->
		{
			System.out.println(dep);
			/*Iterator<Employee> i = empInDept.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}*/
			empInDept.forEach(System.out::println);
		});
		
		
	}

}