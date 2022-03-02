import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String []args) {
		int []a = {2,3,9,8,5,4};
		SelectionSort.ss(a);
	}
	
	public static void ss(int []arr) {
		for(int i =0; i<arr.length-1; i++) {
			int min_idx = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					min_idx = j;
				}
			}
			int temp = arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i] = temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
