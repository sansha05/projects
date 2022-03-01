import java.util.Arrays;

public class ArrayRotation {
	
	public static int[] rightRotate(int []num, int k) {
		int []newNum = new int[num.length];
		
		for (int i=num.length-k, j=0; i<num.length; i++, j++) {
			newNum[j] = num[i];
		}
		
		for (int i=0; i<num.length-k; i++) {
			newNum[i+k] = num[i];
		}
		
		return newNum;
		
	}

	public static void main(String[] args) {
		int []num = {1,2,3,4,5,6,7};
		int k=5;
		
		int []rotatedarr = ArrayRotation.rightRotate(num, k);
		System.out.println(Arrays.toString(rotatedarr));
		
	}


}