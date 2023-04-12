package com.extra;

class First {
	int num;
	boolean available=false;
	public synchronized int put(int num) {
		if(available)
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}		
		
		this.num=num;
		
		String name = Thread.currentThread().getName();
		System.out.println(name+ " produces " +  num);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		available=true;
		notify();
		return num;
		
	}

	public synchronized int get() {
		if(!available)
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}	
		String name = Thread.currentThread().getName();
		System.out.println(name+ " consumes " +  num);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		available=false;
		notify();
			
		return num;
	}
}

class Producer implements Runnable {

	First f;

	public Producer(First f) {
		this.f = f;
		new Thread(this,"Producer").start();
	}

	@Override
	public void run() {
		
		int x = 1, i = 1;
		while (x < 10) {
		
			f.put(i++);
			x++;
		}
	}

}

class Consumer implements Runnable {

	First f;

	public Consumer(First f) {

		this.f = f;
		new Thread(this,"Consumer").start();
	}

	@Override
	public void run() {
		int x = 1;
		while (x < 10) {
			
			f.get();
			x++;
		}

	}

}

public class PC {

	public static void main(String[] args) {
		First f = new First();
		new Producer(f);
		new Consumer(f);
	}

}