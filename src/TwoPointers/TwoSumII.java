package TwoPointers;

import java.util.Arrays;

public class TwoSumII {

	
	//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
	public static void main(String[] args) {
		
		int[] nums = {2,5,7,9,11};
		int[] ans = twoSum(nums, 20);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int[] twoSum(int[] arr, int target) {
		
		int left=0;
		int right= arr.length-1;
		
		while(left<right) {
			
			int sum= arr[left]+arr[right];
			if(sum == target) {
				return new int[] {left+1, right+1};
			}else if(sum > target) {
				right--;
			}else {
				left++;
			}
		}
		return new int[] {-1,-1};
	}

}
