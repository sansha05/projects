package com.thread;

class Demo1 implements Runnable {
	@Override
	public void run() {
		System.out.println("thread created via implementing runnable");
	}
}

public class RunnableDemo {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		Thread t = new Thread(d);
		
		t.start();
		System.out.println("main thread");
		
	}

}
