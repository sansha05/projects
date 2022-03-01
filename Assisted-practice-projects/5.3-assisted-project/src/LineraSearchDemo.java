import java.util.Scanner;

public class LineraSearchDemo {

	public static void main(String[] args) {
		int []arr = {4,3,7,2,9,1};
		System.out.println("Enter value to search: ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		linearSearch(arr, key);


	}
	
	public static void linearSearch(int []arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Element is present at index " + i + "!");
			}
		}
		
	}

}
