package typecasting;

public class Typecasting {

	public static void main(String[] args) {
		//implicit type casting
		System.out.println("Implicit Type Casting");
		int a = 56;
		System.out.println("a=" + a);
		float b = a;
		System.out.println("b=" + b);
		
		//explicit type casting
		System.out.println();
		System.out.println("Explicit Type Casting");
		int c = 65;
		System.out.println("c=" + c);
		char d = (char)c;
		System.out.println("d=" + d);

	}

}
