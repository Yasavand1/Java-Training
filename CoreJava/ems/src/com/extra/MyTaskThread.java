package com.extra;

public class MyTaskThread implements Runnable {

	@Override
	public void run() {
		Task t = new Task();
		t.connect();
		
	}

}
