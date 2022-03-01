
public class ThrowsDemo {
	static void divide() throws ArithmeticException {
		int a = 3;
		int b = 0;
		if (b==0) {
			throw new ArithmeticException("can't divide by 0");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divide();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
