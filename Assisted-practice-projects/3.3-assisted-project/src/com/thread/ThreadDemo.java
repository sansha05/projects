package com.thread;

class Demo extends Thread {
	public void run() {
		System.out.println("I am from " + this.getName());
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.start();
		System.out.println("I am from main thread");
	}

}
