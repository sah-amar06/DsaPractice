package arrays;

public class BinarySearchPractice {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9};
		int[] num1 = {9,8,7,6,5,4,3,2,1};
		System.out.println(binarySearch(num, 8));
		System.out.println(descendingBinarySearch(num1, 4));
		

	}
	
	
	public static int binarySearch(int[] arr, int target) {
		
		if(arr == null || arr.length ==0) {
			return -1;
		}
		
		int left = 0;
		int right = arr.length-1;
		
		
		
		while(left<=right) {
			
			int mid = left + (right-left)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(arr[mid] < target) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		return -1;
	}
	
	public static int descendingBinarySearch(int[] arr, int target) {
		
		if(arr ==null || arr.length ==0) {
			return -1;
		}
		
		int left = 0;
		int right = arr.length-1;
		
		while(left<=right) {
			int mid = left + (right-left)/2;  //because we are doing operation on index, not on the value of that index
			
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid] > target) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		return -1;
	}

}
