

public class BinarySearch {

	public static void main(String[] args) {
		int []arr = {2,4,5,8,9,12,16};
		int key=5;
		
		
		System.out.println("element present at index " + bsearch(arr, key));
		

	}
	
	public static int bsearch(int []arr, int key) {
		
		int start=0;
		int end=arr.length;
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

//public class BinarySearch {
//
//    public static  void main(String[] args){
//
//
//        int[] arr = {3,6,9,12,15};
//        int key = 12;
//        int arrlength = arr.length;
//        binarySearch(arr,0,key,arrlength);
//    }
//
//public static void binarySearch(int[] arr, int start, int key, int length){
//
//        int midValue = (start+length)/2;
//        while(start<=length){
//
//            if(arr[midValue]<key){
//
//                start = midValue + 1;
//            } else if(arr[midValue]==key){
//                System.out.println("Element is found at index :"+midValue);
//                break;
//            }else {
//
//                length=midValue-1;
//            }
//            midValue = (start+length)/2;
//        }
//            if(start>length){
//
//                System.out.println("Element is not found");
//            }
//
//}
//
//}

