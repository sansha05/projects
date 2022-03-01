
public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =34;
		int b =0;
		 try {
			 int c  = a/b;
		 } catch (Exception e) {
			 System.out.println(e.getMessage());
		 } finally {
			 System.out.println("I am finally");
		 }

	}

}
