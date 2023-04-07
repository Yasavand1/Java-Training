package com.dal.array;

class MouterClass
{
	int x =10;
	public void OuterMethod()
	{
		int j=90;
		class MinnerClass
		{
			public void minnerMethod()
			{
			System.out.println("Hello ..." + x + j);
			}
		}
		MinnerClass mic = new MinnerClass();
		mic.minnerMethod();		
		
	}	
	public static void main(String[] a)
	{
		MouterClass moc = new MouterClass();
		moc.OuterMethod();		
	
		//MinnerClass mic = new MinnerClass();
		//mic.minnerMethod();
	}
}


//Create instance and local variable inside the inner class and access  - No
// Can the method local inner class be abstract?  - No














