package LeetcodeProblemSeries;

import java.util.Arrays;

public class RemoveElement {

	// https://leetcode.com/problems/remove-element/description/
	public static void main(String[] args) {

		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		System.out.println(removeElement(nums, 2));

	}

	/**
	 * Given an integer array:
	 * 
	 * nums = {0,1,2,2,3,0,4,2}
	 * value = 2 
	 * Our goal is to remove every occurrence of the given value from the array. 
	 * In-place update: 
	 * We must modify the original array without creating another array.
	 * 
	 * 
	 * Approach:
	 *
	 * We use the Two Pointer technique. 
	 * i -> Read Pointer Traverses every element of the array.
	 * 
	 *
	 * ans -> Write Pointer Points to the position where the next valid element
	 * should be placed.
	 * 
	 * If the current element is not equal to the target value:
	 *
	 * arr[ans] = arr[i]; 
	 * ans++;
	 *
	 * Finally, ans represents the total number of elements remaining after removing
	 * the target value.
	 * 
	 * @param arr
	 * @param value
	 * @return
	 */
	public static int removeElement(int[] arr, int value) {

		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != value) {
				arr[k] = arr[i];
				k++;
			}

		}

//		for(int j=0; j<k; j++) {
//			System.out.print(arr[j] + " ");
//		}
		System.out.println(Arrays.toString(Arrays.copyOf(arr, k)));
		return k;

	}

}
