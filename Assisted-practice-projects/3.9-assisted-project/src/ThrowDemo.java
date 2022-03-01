
public class ThrowDemo {
	public static void main(String []args) {
		int a = 8;
		int b =0;
		
		try {
			if (b==0) {
				throw new ArithmeticException("can't divide by zero");
			}
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
