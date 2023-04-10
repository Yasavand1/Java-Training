package com.extra;

interface Addition {
	public int add(int a, int b);
	
}

public class Java8 {

	public static void main(String[] args) {
		
		Addition  sum=(a,b)->{
			return a+b;
		};
		System.out.println(sum.add(10, 7));
	}

}
