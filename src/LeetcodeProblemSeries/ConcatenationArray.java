package LeetcodeProblemSeries;

import java.util.Arrays;

public class ConcatenationArray {

	// https://leetcode.com/problems/concatenation-of-array/

	/**
	 * Given an integer array nums of length n, you want to create an array ans of
	 * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
	 * (0-indexed).
	 * 
	 * Specifically, ans is the concatenation of two nums arrays.
	 * 
	 * Return the array ans.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		int[] nums = {1,2,1};
		System.out.println(Arrays.toString(getConcatenation(nums)));
		

	}
	
	public static int[] getConcatenation(int[] nums) {
		
		int[] ans = new int[2*nums.length];
		
		for(int i=0; i<nums.length; i++) {
			/**
			 * ans[0] = nums[0];
			 * Copy the original array into the first half of ans.
			 */
			ans[i] = nums[i];
			
			/**
			 * ans[0+nums.length] = nums[i];
			 * Copy the same values again into the second half of ans.
			 */
			ans[i+nums.length] = nums[i];
			
			/**
			 * Dry run: int[] nums = {1,2,1};
			 * nums.length = 3;
			 * Initially: 
			 * ans[_,_,_,_,_,_]
			 * ----------------------
			 * i=0;
			 * ans[0] = nums[0];
			 *        = 1;
			 *
			 * 
			 * ans[0+3] = nums[0];
			 * ans[3]   = nums[0];
			 *          = 1;
			 * ans[1,_,_,1_,_];
			 * 
			 */
		}
		return ans;
	}

}
