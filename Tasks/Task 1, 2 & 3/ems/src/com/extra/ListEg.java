package com.extra;

import java.util.*;

public class ListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		list.add("Test1");
		list.add("Test2");
		System.out.println(list);

		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Set list = new HashSet();
		list.add("Test1");
       list.add("Test2");
       list.add(10);
	 System.out.println(list);
	 
	 Map map = new HashMap();
	 map.put(1,  "Apple");
	 map.put(2, "Mango");
	 System.out.println(map);	
	 
	 Collection c = map.values();
	 Iterator irr = c.Iterator();
	 while (ii.hasNext()) {
		 System.out.println(ii.next());
	 }
		 
	 
	}

}
