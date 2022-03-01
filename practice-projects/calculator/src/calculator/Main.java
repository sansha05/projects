package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		Scanner ip = new Scanner(System.in);
		int opt;
		
		do {
			System.out.println("\nArthmetic Calculator");
			System.out.println("======================");
			System.out.println("1-> Add");
			System.out.println("2-> subtract");
			System.out.println("3-> multiply");
			System.out.println("4-> divide");
			System.out.println("5-> exit");
			
			opt = ip.nextInt();
			
			if(opt == 1) {
				System.out.print("Enter first value: ");
				cal.a = ip.nextInt();
				System.out.print("Enter second value: ");
				cal.b = ip.nextInt();
				System.out.println("result: " + cal.add());
			} else if(opt == 2) {
				System.out.print("Enter first value: ");
				cal.a = ip.nextInt();
				System.out.print("Enter second value: ");
				cal.b = ip.nextInt();
				System.out.println("result: " + cal.sub());
			} else if(opt == 3) {
				System.out.print("Enter first value: ");
				cal.a = ip.nextInt();
				System.out.print("Enter second value: ");
				cal.b = ip.nextInt();
				System.out.println("result: " + cal.mul());
			} else if(opt == 4) {
				System.out.print("Enter first value: ");
				cal.a = ip.nextInt();
				System.out.print("Enter second value: ");
				cal.b = ip.nextInt();
				System.out.println("result: " + cal.div());
			} else if(opt==5) {
				System.out.println("Program end!");
			} else {
				System.out.println("Plz enter valid option!");
			}
			
			
			
			
		} while(opt != 5);

	}

}
