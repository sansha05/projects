//package emailid_validation;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.regex.Pattern;
//
//public class ValidateEmail {
//
//	public static void main(String[] args) {
//		
//		ArrayList<String> ems = new ArrayList<>();
//		ems.add("mithun23@gmail.com");
//		ems.add("jai.singh@gmail.com");
//		ems.add("madhusingh@gmail.com");
//		
//		Scanner input = new Scanner(System.in);
//		String emailtofind = input.nextLine();
//		
////		for(String em: ems) {
////			
////			if (emailtofind.equals(em)) {
////				System.out.println(em);
////				break;
////			}
//		for(int i=0; i<ems.size(); i++) {
//			if (emailtofind.equals(ems.get(i))) {
//				System.out.println(emailtofind + " is present at index " + i);
//				break;
//			}
//		}
//		
//	}
//
//}


package emailid_validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateEmail {

	public static void main(String[] args) {
		String []emails = {
				"mithun23@gmail.com", 
				"priyankan.sha@gmail.com", 
				"madhusingh123@gmail.com",
				"dharmendrathakur@gmail.com",
				"jai.singh@gmail.com"
			
				};
		
		Scanner in = new Scanner(System.in);
		String emailtofind = in.next();

		
		for(int i=0; i<emails.length; i++) {
			if(emailtofind.equals(emails[i])) {
<<<<<<< HEAD
				System.out.println(emailtofind + " is present at " + (i+1)+ " position!");
=======
				System.out.println(emailtofind + "is present at " + (i+1) + " position!");
>>>>>>> origin/master
				break;
			}
			
		}
	}

}
