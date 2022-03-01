import java.util.Arrays;
import java.util.Scanner;

public class RangeQueries {

	public static void main(String[] args) {
		int []nums = {3,2,7,8,5,4,9};
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Arrays.toString(nums));
		int l = sc.nextInt();
		int r =sc.nextInt();
		
		if (l<=r && r<=nums.length) {
			System.out.println(RangeQueries.addInRange(nums, l, r));
		} else {
			System.out.println("run program again and provide valid input");
		}
		
		
	}
	
	public static int addInRange(int []arr, int l, int r) {
		int sum=0;
		for (int i=l-1; i<r; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
