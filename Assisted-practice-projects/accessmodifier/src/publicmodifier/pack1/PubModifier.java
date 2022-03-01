package publicmodifier.pack1;

import publicmodifier.pack2.PubModifierDemo;

public class PubModifier {

	public static void main(String[] args) {
		PubModifierDemo obj = new PubModifierDemo();
		// public function so it is accessible to any where
		obj.display();
			

	}

}
