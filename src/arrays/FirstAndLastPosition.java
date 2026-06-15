package arrays;

import java.util.Arrays;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		int[] nums = {1,2,7,8,9,7};
		
		int[] arr = {1,2,3,5,6,8,9,9,10,11,11,11,11,11,15, 18};
		int[] ans = getFirstAndLastIndex(nums, 7);
		System.out.println(Arrays.toString(ans));
		int[] answer = getFirstAndLastOccurance(arr, 11);
		System.out.println(Arrays.toString(answer));

	}
	
//	public static int[] getFirstAndLastIndex(int[] arr, int target) {
//		
//		
//		for(int index=0; index<arr.length; index++) {
//			if(arr[index] == target && arr[arr.length-index] == target) {
//				return new int[] {index, arr.length-index};
//			}
//		}
//		return new int[] {};
//	}

	
	public static int[] getFirstAndLastIndex(int[] arr, int target) {

	    int first = -1;
	    int last = -1;

	    for (int index = 0; index < arr.length; index++) {

	        if (arr[index] == target) {

	            if (first == -1) {
	                first = index;
	            }

	            last = index;
	        }
	    }

	    return new int[] { first, last };
	}
	
	
	public static int[] getFirstAndLastOccurance(int[] arr, int target) {
		int[] ans = {-1, -1};
		
		int start = search(arr, target, true);
		
		if(start ==-1) {
			return ans;
		}
		int end = search(arr, target, false);
		
		ans[0] = start;
		ans[1] = end;
		
		return ans;
		
	}
	
	public static int search(int[]arr, int target, boolean findStartIndex) {
		
		if(arr == null || arr.length == 0) {
			return -1;
		}
		
		int start = 0, end = arr.length-1;
		int ans = -1;
		while(start<=end) {
			int mid =  start +(end-start)/2;
			
			if(arr[mid] ==target) {
				ans = mid;
				if(findStartIndex) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}else if(arr[mid]< target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return ans;
		
	}
	
	
}
