package privatemodifier;

class PubModifierDemo {
	private void display() {
		System.out.println("you are using private access modifier");
	}
}

public class PubModifier {
	public static void main(String[] agrs) {
	PubModifierDemo obj = new PubModifierDemo();
	//the below line will give error because the display function is only private to their class
	//obj.display();
	 
	}
}
