class MyException extends Exception {
	public MyException(String str) {
		// TODO Auto-generated constructor stub
		super(str);
		
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("custom exception");
		} catch(MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
