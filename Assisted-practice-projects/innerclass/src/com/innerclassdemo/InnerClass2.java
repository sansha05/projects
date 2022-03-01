package com.innerclassdemo;

class A1 {
	private String msg = "I am from class inside method";
	
	void display() {
		class B {
			void show() {
				System.out.println(msg);
			}
		}
		
		B b = new B();
		b.show();
	}
}

public class InnerClass2 {

	public static void main(String[] args) {
		A1 a = new A1();
		a.display();

	}

}
