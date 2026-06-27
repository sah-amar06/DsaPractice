package LeetcodeProblemSeries;

import java.util.Arrays;

public class RemoveDuplicate {

	// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2, 2, 3 };
		int[] nums1 = { 1, 1, 2, 2, 3 };
		
		System.out.println(removeDuplicateSortedArray(nums));
		int[] res = removeDuplicates(nums1);
		System.out.println(Arrays.toString(res));

	}

	/**
	 * Given an integer array nums sorted in non-decreasing order, remove the
	 * duplicates in-place such that each unique element appears only once. The
	 * relative order of the elements should be kept the same.
	 * 
	 * Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After
	 * removing duplicates, return the number of unique elements k.
	 * 
	 * The first k elements of nums should contain the unique numbers in sorted
	 * order. The remaining elements beyond index k - 1 can be ignored.
	 * 
	 * 
	 * Input: nums = [1,1,2] Output: 2, nums = [1,2,_] Explanation: Your function
	 * should return k = 2, with the first two elements of nums being 1 and 2
	 * respectively. It does not matter what you leave beyond the returned k (hence
	 * they are underscores).
	 * 
	 * @param arr
	 */
	public static int removeDuplicateSortedArray(int[] arr) {

		int k = 1;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] != arr[k - 1]) {
				arr[k] = arr[i];
				k++;

				/**
				 * Approach:
				 *
				 * Since the array is already sorted, all duplicate elements appear next to each
				 * other.
				 *
				 * We use the Two Pointer approach.
				 *
				 * i -> Read Pointer Traverses every element in the array.
				 *
				 * k -> Write Pointer Points to the position where the next unique element
				 * should be placed.
				 *
				 * Initially, k = 1 because the first element is always unique.
				 *
				 * We start traversing from index 1.
				 *
				 * If the current element (arr[i]) is different from the last unique element
				 * (arr[k - 1]), then we have found a new unique element.
				 *
				 * Copy the current element to index k and increment k.
				 *
				 * Finally, return k, which represents the number of unique elements in the
				 * array.
				 * 
				 * 
				 * Dry Run:
				 *
				 * nums = {1, 1, 2, 2, 3}
				 *
				 * Initially: k = 1
				 *
				 * ------------------------------------------------- 
				 * i = 1
				 *
				 * arr[i] = arr[1] = 1 arr[k - 1] = arr[0] = 1
				 *
				 * Since both are equal, it is a duplicate element.
				 *
				 * Skip it.
				 *
				 * Array = {1,1,2,2,3} 
				 * k = 1
				 *
				 * ------------------------------------------------- 
				 * i = 2
				 *
				 * arr[i] = arr[2] = 2 arr[k - 1] = arr[0] = 1
				 *
				 * They are different.
				 *
				 * Copy current element to index k.
				 *
				 * arr[k] = arr[i] arr[1] = arr[2]
				 *
				 * Array becomes: {1,2,2,2,3}
				 *
				 * Increment k.
				 *
				 * k = 2
				 *
				 */
			}

		}
		return k;

	}
	
	
	public static int[] removeDuplicates(int[] arr) {
		
		int k=0; 
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=arr[k]) {
				k++;
				arr[k] = arr[i];
				
			}
		}
		return Arrays.copyOf(arr,k+1);
	}

}
