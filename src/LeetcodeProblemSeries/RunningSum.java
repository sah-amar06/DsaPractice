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
		
		int[] ans = new int[arr.length];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			
			sum = sum+arr[i];
			ans[i] = sum;
		}
		return  ans;
	}
	
	public static int[] getRunningSum1(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			arr[i] = arr[i]+arr[i-1];
		}
		return arr;
	}

}
