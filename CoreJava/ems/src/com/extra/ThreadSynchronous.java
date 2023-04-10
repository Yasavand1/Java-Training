package com.extra;

class Thread1 {
	
	public void print1_5() {
		System.out.println("Method Started");
		synchronized(this) {
			try {
				for(int i=1; i<5; i++)
				{
				Thread.sleep(1000);
				System.out.println("i = " + i);
				}
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("Method Ended");
			
		}
		
	}

class Thread2 extends Thread{
	
	Thread1 t1;

	public Thread2(Thread1 t1) {
		this.t1 = t1;
	}

	public void run() {
		t1.print1_5();

	}
}


public class ThreadSynchronous {
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Started");
		Thread1 t1 = new Thread1();
		Thread2 t2a = new Thread2(t1);
		Thread2 t2b = new Thread2(t1);
		
		t2a.start();
		t2b.start();
		System.out.println("Main Ended");
	}
	

}
