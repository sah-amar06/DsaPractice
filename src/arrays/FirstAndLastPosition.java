package arrays;

import java.util.Arrays;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		int[] nums = {1,2,7,8,9,7};
		int[] ans = getFirstAndLastIndex(nums, 7);
		System.out.println(Arrays.toString(ans));

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
}
