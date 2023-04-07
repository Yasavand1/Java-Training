package com.dal.array;

class StringEg
{	
	public static void main(String[] aa)
	{
		String str1 = "I like Java";
		System.out.println("str 1 " + str1);
		System.out.println(" Is Empty ?" +str1.isEmpty());
		System.out.println(" Length of str1: " + str1.length());
		System.out.println(" charAt " +str1.charAt(4));
		System.out.println(" concat " + str1.concat(" Programming"));
		System.out.println(" equals : " +str1.equals("I like C") );
		System.out.println(" lowercase : " +str1.toLowerCase());
		System.out.println(" substring(2) " + str1.substring(2));
		System.out.println(" substring(2,5) " + str1.substring(2,5));	
		System.out.println("compare " + str1.compareTo("I like java"));
		System.out.println(" contains :" + str1.contains("Java"));
		System.out.println(" trim " + "    ABC    ");
		//System.out.println(" " + );


		String s1="Java";
		String s2="Java";
		 s1="java";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());


		StringBuffer demo1 = new StringBuffer("Good");
		System.out.println(demo1.hashCode());
		System.out.println(demo1);
		demo1.append(" Afternoon");
		System.out.println(demo1);
		System.out.println(demo1.hashCode());
		
		StringBuilder demo2 = new StringBuilder("Good");
		System.out.println(demo2.hashCode());
		System.out.println(demo2);
		demo2.append(" Evening");
		System.out.println(demo2);
		System.out.println(demo2.hashCode());
		
		
		
	}
}





