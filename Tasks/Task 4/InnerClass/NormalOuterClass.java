package InnerClass;

public class NormalOuterClass {
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
		NormalOuterClass.InnerClass ic = new NormalOuterClass.InnerClass();
	ic.display();

	NormalOuterClass oc = new NormalOuterClass();
	oc.method();
	}
}
