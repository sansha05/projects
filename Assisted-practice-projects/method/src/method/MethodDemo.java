package method;

public class MethodDemo {
	private String name;
	
	void setName(String n) {
		this.name = n;
	}
	
	void greet() {
		System.out.println("Hello "+ name +"!");
	}
	
	public static void main(String []args) {
		MethodDemo obj = new MethodDemo();
		obj.setName("sandeep sharma");
		obj.greet();
	}

}
