package constractors;

public class ConstractorExample {
	private String name;
	private int age;
	
	public ConstractorExample(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("Hello " + name + " your age is " + age +".");
	}
	
	public static void main(String []agrs) {
		ConstractorExample cons = new ConstractorExample("sandeep sharma", 22);
		
		cons.displayInfo();
	}

}
