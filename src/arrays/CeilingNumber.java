package arrays;

public class CeilingNumber {

	public static void main(String[] args) {
		
		int[] nums = {1,5,9,11,16,19,22,30,};
		int[] nums1 = {90,80,70,60,50,40,30,20,10};
		System.out.println(getCeilingNum(nums, 17));
		System.out.println(orderCheck(nums));
		System.out.println(orderCheck(nums1));
	}

	public static int getCeilingNum(int[] arr, int target) {

		if (arr == null || arr.length == 0) {
			return -1;
		}

		if (target > arr[arr.length - 1]) {
			return -1;
		}

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] ==target) {
				return mid;
			}
			
			
			if(arr[mid] <target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
			
			
		}

		return start;
	}

	public static boolean orderCheck(int[] arr) {

		boolean isAscending = true;
		boolean isDescending = true;

		for (int index = 0; index < arr.length - 1; index++) {
			if (arr[index] > arr[index + 1]) {
				isAscending = false;
			}

			if (arr[index] < arr[index + 1]) {
				isDescending = false;
			}
		}
		return isAscending || isDescending;

	}

}
