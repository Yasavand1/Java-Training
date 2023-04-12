package com.extra;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEg8 {

	public static void main(String[] args) {
		
		List<String> strlist = Arrays.asList("Rat","Cat","Lion","","","Tiger","Elephant","Cheeta","Rhino"); 
		System.out.println("List of Strings : " + strlist);
        long count =0;
	 	count = strlist.stream().filter((str)->str.isEmpty()).count();
	 	System.out.println("COunt of empty string  : " + count);
	 	
	 	count = strlist.stream().filter(str->str.length()==3).count();
	 	System.out.println("Count of strings with length 3 : " + count);
	 	
	 	List<String> strlist1 = strlist.stream().filter(str->!str.isEmpty()).collect(Collectors.toList());
		System.out.println("Strings without empty string : " + strlist1);
		
		String cstr = strlist.stream().filter(str->!str.isEmpty()).collect(Collectors.joining("    -     "));
		System.out.println("Str collected : " + cstr);
	
		List<Integer> intlist = Arrays.asList(1,3,8,4,6,9,7,2); 
		System.out.println("List of integers : " + intlist);
		
		IntSummaryStatistics stat = intlist.stream().mapToInt(i->i).summaryStatistics();
		System.out.println(" Max : "+stat.getMax());
		System.out.println(" Min : "+stat.getMin());
		System.out.println(" Sum : "+stat.getSum());
		System.out.println(" COunt : "+stat.getCount());
		System.out.println(" Avg  : "+stat.getAverage());
		
	}

}
