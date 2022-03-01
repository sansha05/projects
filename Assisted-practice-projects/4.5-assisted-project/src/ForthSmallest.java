import java.util.Arrays;

public class ForthSmallest {

	public static void main(String[] args) {
		int []numbers = {4,2,7,5,8,1,3};
		int k = 4;
		
		int []newNumbers = ForthSmallest.bubbleSort(numbers);
		System.out.println("Forth samllest element is " + newNumbers[k-1]);
		
		

	}
	
	public static int[] bubbleSort(int []arr) {
		for(int i=0; i<arr.length-1; i++) {
			for (int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				
			}
		}
		return arr;
	}

}
