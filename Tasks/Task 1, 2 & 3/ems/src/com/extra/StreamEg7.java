package com.extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEg7 {

	public static void main(String[] args) {
		List<String> strlist = Arrays.asList("Rat","Cat","Lion","","Tiger","Elephant","Cheeta"); 
		System.out.println("List of Strings : " + strlist);
		
		long count =0;
		count=getEmptyStringsFromList(strlist);
		System.out.println("COunt of empty string  : " + count);
		
		count=getStringsWithLength3(strlist);
		System.out.println("Count of strings with length 3 : " + count);
		
		List<String> strlist1 = deleteEmtpyStringNPrint(strlist);
		System.out.println("Strings without empty string : " + strlist1);
		
		List<Integer> intlist = Arrays.asList(1,3,8,4,6,9,7,2); 
		System.out.println("List of integerz : " + intlist);
		
		int maxval = getMaxValue(intlist);
		System.out.println("Max Value : " + maxval);
		
		int minval = getMinValue(intlist);
		System.out.println("Min Value : " + minval);
		
		
		int sum = getSum(intlist);
		System.out.println("Sum : " + sum);
		
	}

	private static int getSum(List<Integer> intlist) {
		int sum=(int)intlist.get(0);
		for(int i=1; i<intlist.size();i++)
		{
			sum += intlist.get(i);
		}
		return sum;
	}

	private static int getMinValue(List<Integer> intlist) {
		int min=intlist.get(0);												//9
		for(int i=0;i<intlist.size();i++) {								//7	
			Integer num = intlist.get(i);
			if(num.intValue() <min)	{									//2>9
				min=num.intValue();
			}									
		}
		return min;
	}
//1,3,8,4,6,9,7,2
	private static int getMaxValue(List<Integer> intlist) {
		int max=intlist.get(0);												//9
		for(int i=0;i<intlist.size();i++) {								//7	
			Integer num = intlist.get(i);
			if(num.intValue() >max)	{									//2>9
				max=num.intValue();
			}									
		}
		return max;
	}

	private static List<String> deleteEmtpyStringNPrint(List<String> strlist) {
		List<String> fstr= new ArrayList<String>();
		for(String str:strlist) {
			if(!str.isEmpty()) {
				fstr.add(str);
			}
		}	
		
		return fstr;
	}

	private static long getStringsWithLength3(List<String> strlist) {
		long count =0;
		for(String str:strlist) {
			if(str.length()==3) {
				count++;
			}
		}
		
		return count;
	}

	private static long getEmptyStringsFromList(List<String> strlist) {
		long count =0;
		for(String str:strlist) {
			if(str.isEmpty()) {
				count++;
			}
		}
		
		return count;
	}

	
}