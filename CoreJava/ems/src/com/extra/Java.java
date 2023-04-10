package com.extra;

interface Addition{
	public int add(int a,int b);
}

public class Java implements Addition{
	
	@Override
	public int add(int a, int b) {
	
		return a+b;
	}
	public static void main(String[] args) {
		Java f = new Java();
		
		System.out.println(f.add(4, 5));

	}

	
}