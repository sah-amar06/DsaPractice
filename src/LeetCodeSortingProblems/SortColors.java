package LeetCodeSortingProblems;

import java.util.Arrays;

public class SortColors {

	
	//https://leetcode.com/problems/sort-colors/
	public static void main(String[] args) {
		
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));

	}
	
	public static void sortColors(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] =arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}

}
