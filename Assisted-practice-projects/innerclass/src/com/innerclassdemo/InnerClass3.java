package com.innerclassdemo;

class A2 {
	void display() {
		System.out.println("I am from A2");
	}
}

public class InnerClass3 {
	public static void main(String []a) {
		A2 c = new A2() {
			void display() {
				System.out.println("I am from anonymous class");
			}
		};
		
		c.display();
	}

}
