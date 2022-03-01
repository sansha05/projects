package com.innerclassdemo;


class A {
	private String msg = "I am from member class";
	// member class
	class Inner {
		void display() {
			System.out.println(msg);
		}
	}
}

public class InnerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A.Inner in = a.new Inner();
		in.display();
		
	}

}
