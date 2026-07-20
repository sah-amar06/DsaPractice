package TwoPointers;

import java.util.Arrays;

public class SquareOfSortedArray {

	public static void main(String[] args) {
		
		int[] nums = {-7, -3, 2, 3, 11};
		System.out.println(Arrays.toString(getSquare(nums)));

	}
	
	
	public static int[] getSquare(int[] arr) {
		
		int n = arr.length;
		int[] result = new int[n];
		
		int left =0; 
		int right = n-1;
		int pos = n-1;
		
		
		/**
		 * Math.abs() is a built-in Java method that returns the absolute value of a number.
		 * The absolute value means the number's distance from zero, ignoring its sign.
		 */
		while(left<=right) {
			if(Math.abs(arr[left])>Math.abs(arr[right])) {
				
				result[pos] = arr[left]*arr[left];
				left++;
				
			}else {
				result[pos] = arr[right]*arr[right];
				right--;
				
			}
			pos--;
		}
		return result;
	}

}
