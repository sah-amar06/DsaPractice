package arrays;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		
		int[] asc = {1,2,3,4,5,6,7,8,9};
		int[] desc =  {9,8,7,6,5,4,3,2,1};
		
		System.out.println(binarySearch(asc, 2));
		System.out.println(binarySearch(desc, 7));
		
		System.out.println(binarySearch(asc, 9));
		System.out.println(binarySearch(desc, 8));
		
		int[] single = {7};
		System.out.println(binarySearch(single, 7));
		System.out.println(binarySearch(single, 9));
		

	}

	public static int binarySearch(int[] arr, int target) {

		if (arr == null || arr.length == 0) {
			return -1;
		}
		

		int left = 0;
		int right = arr.length - 1;
		
		boolean isAscending = arr[0] < arr[arr.length-1];

		while (left <= right) {
			
			int mid = left + (right-left)/2;
			
			if(arr[mid] == target) {
				return mid;	
			}
			
			if(isAscending) {
				if(arr[mid] < target) {
					left = mid+1;
				}else {
					right = mid-1;
				}
			}else {
				if(arr[mid] > target) {
					left = mid+1;
				}else {
					right = mid-1;
				}
			}

		}

		return -1;

	}

}
