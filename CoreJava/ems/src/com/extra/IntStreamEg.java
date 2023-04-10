package com.extra;


import java.util.stream.IntStream;

public class IntStreamEg {

	public static void main(String[] args) {
	  int[] values = {3,4,6,8,2,1,10,11,0};
	  System.out.println("primitive int values");
	  IntStream.of(values).forEach(System.out::println);
	  
	  System.out.println("Count : " + IntStream.of(values).count());
	  System.out.println("Max : " + IntStream.of(values).max().getAsInt());
	  System.out.println("Min : " + IntStream.of(values).min().getAsInt());
	  System.out.println("Sum : " + IntStream.of(values).sum());
	  System.out.println("Avg : " + IntStream.of(values).average().getAsDouble());
	  
	  System.out.println("*****************************************");
	  IntStream.of(values).sorted().forEach(System.out::println);
	  
	  System.out.println("*****************************************");
	  int[] va = {1,2,3,4,5};
	  IntStream.of(va).filter(val->val%2==0).forEach(System.out::println);
	  System.out.println("*****************************************");
	  System.out.println(IntStream.range(10, 12).sum()); //1+2+3+4
	  System.out.println(IntStream.rangeClosed(1, 5).sum()); 
	  
	  System.out.println("Reduce : " + IntStream.of(va).reduce(11, (x,y)->x+y));
	  
	  
	}

}