
public class ExponentialSearch {
	public static void main(String[] args) {
		int []arr = {2,4,5,8,9,12,16};
		int key=3;
		
		
		System.out.println("element present at index " + expoSearch(arr, key));
		

	}
	
	public static int expoSearch(int []arr, int key) {
		if (arr[0] == key) {
			return 0;
		}
		int i=1;
		while(i<arr.length && arr[i]<=key) {
			i*=2;
		}
		return bsearch(arr,i/2,i,key);
	}
	
	
	
	
	public static int bsearch(int []arr, int start, int end, int key) {
		
		int mid=(start+end)/2;
		
		while(start <= end) {
			
			
			if(arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				start = mid+1;
			} else {
				end = mid - 1;
			}
			mid = (start+end)/2;
			
		}
		return -1;
		
	}

}
