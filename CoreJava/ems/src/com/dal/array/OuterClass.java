package com.dal.array;

class OuterClass
{
	static int i =10;
	public void method()
	{
		System.out.println("i == " + ++i);
	}	
	static class InnerClass
	{
		public void display()
		{
			System.out.println("i == " + i);
		}
	}
	
	public static void main(String[] a)
        {
	OuterClass.InnerClass ic = new OuterClass.InnerClass();
	ic.display();

	OuterClass oc = new OuterClass();
	oc.method();
	}
}

