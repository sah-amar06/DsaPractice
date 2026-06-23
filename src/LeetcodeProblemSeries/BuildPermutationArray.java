package LeetcodeProblemSeries;

import java.util.Arrays;

public class BuildPermutationArray {

	public static void main(String[] args) {
		
		
		//https://leetcode.com/problems/build-array-from-permutation/description/
		
		int[] nums = {0,2,1,5,3,4};
		//System.out.println(Arrays.toString(buildPermutationArray(nums)));
		int[] nums1 = {5,0,1,2,3,4};
		System.out.println(Arrays.toString(buildPermutationArray(nums1)));

	}
	
	public static int[] buildPermutationArray(int[] arr) {
		
		int[] ans = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			ans[i] = arr[arr[i]];
			//Dry run: int[] nums1 = {5,0,1,2,3,4};
			//i=0;
			//ans[0] = arr[arr[0]];
			//ans[0] = arr[5];
			//ans[0] = 4;
 		}
		return ans;
	}

}
