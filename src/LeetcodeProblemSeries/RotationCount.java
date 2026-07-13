package LeetcodeProblemSeries;

public class RotationCount {

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 };
		
		int[] nums1 = {4, 5, 6, 7, 8, 9,10,11,11,11,12, 0, 1,1,1, 2, 3};
		System.out.println(getRotationCount(nums));
		System.out.println(getRotationCount(nums1));
		

	}

	/**
	 * Conside an array of distinct numbers sorted in increasing order. The array
	 * has been rotatted (clockwise) k numbers of time. Find the value of k
	 */

	public static int getRotationCount(int[] arr) {

		int pivot = findPivot(arr);
		
		int anticlockRotation = arr.length-(pivot+1);
		System.out.println("Anticlock rotation count: "+anticlockRotation);
		//If array is not rotated.  
		//We will get 0 with "return pivot + 1;" also. But it improves readability
		if(pivot==-1) {
			return 0;
		}

		return pivot + 1;
	}

	
	public static int findPivot(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}

			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}

			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
	public static int findPivotWithDuplicateElements(int[] arr) {
		
		int start =0;
		int end = arr.length-1;
		
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			
			if(mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			
			
			if(arr[mid]==arr[start] && arr[mid] == arr[end] ) {
				
				//Discard the duplicate elements
				//Check whether start is pivot or not
				
				if(start<end && arr[start]>arr[start+1]) {
					return start;
				}
				start++;
				
				if(end >start && arr[end]<arr[end-1]) {
					return end-1;
				}
				end--;
			}else if(((arr[start]<arr[mid])) || arr[start] == arr[mid] && arr[mid]>arr[end]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
		
	}

}
