import java.util.Arrays;

public class MatrixMult {

	public static void main(String[] args) {
		int [][]mat1 = {
				{2,3,4},
				{1,2,5},
				{4,3,1},
		};
		int [][]mat2 = {
				{1,0,1},
				{2,3,1},
				{0,4,5},
		};
		
		int [][]result= new int[3][3];
		
		for(int row=0; row<mat1.length; row++) {
			for(int col=0; col<mat2.length; col++) {
				result[row][col] = mat1[row][col] * mat2[row][col];
			}
		}
		
		System.out.println(Arrays.deepToString(result));

	}

}
