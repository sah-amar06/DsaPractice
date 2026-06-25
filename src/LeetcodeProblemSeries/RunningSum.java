package LeetcodeProblemSeries;

import java.util.Arrays;

public class RunningSum {

	// https://leetcode.com/problems/running-sum-of-1d-array/

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		System.out.println(Arrays.toString(getRunningSum(nums)));
		System.out.println(Arrays.toString(getRunningSum1(nums)));

	}

	
	
	/**
	 * Given an array nums. We define a running sum of an array as runningSum[i] =
	 * sum(nums[0]…nums[i]).
	 * 
	 * Return the running sum of nums. 
	 * Input: nums = [1,2,3,4] 
	 * Output: [1,3,6,10]
	 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
	 */
	public static int[] getRunningSum(int[] arr) {
		//initializing ans[] of same length of arr[]. where we have to store sum of the running arr[]
		int[] ans = new int[arr.length];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			
			//Add the current element to the previous sum
			sum = sum+arr[i];
			//Storing the running sum at their respective index
			ans[i] = sum;
		}
		return  ans;
	}
	
	public static int[] getRunningSum1(int[] arr) {
		
		//Start from index 1 because the first element
	    // is already the running sum of itself.
		for(int i=1; i<arr.length; i++) {
			arr[i] = arr[i]+arr[i-1];
			/**
			 * Dry Run: int[] nums = {1,2,3,4,5};
			 * i=1;
			 * arr[1] = arr[1]+arr[1-1];   ->current value + previous running sum
			 * arr[1] = 2+1;
			 * arr[1] = 3;
			 * [1,3,3,4,5]
			 * Here, we are keeping arr[0] is same because it's the starting index and 
			 * no need to do any addition with pervious element.
			 * 
			 */
		}
		return arr;
	}

}
