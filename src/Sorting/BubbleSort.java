package Sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] nums = {3,1,4,5,2};
		bubbleSortArray(nums);
		System.out.println(Arrays.toString(nums));
		bubbleSortArrayDescending(nums);
		System.out.println(Arrays.toString(nums));
		
		int[] arr = {1,2,3,4,5};
		bubbleSortArray(arr);
		System.out.println(Arrays.toString(arr));
		bubbleSortArrayDescending(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	/**
	 * Sorts the array in ascending order using Bubble Sort.
	 *
	 * During each pass, the largest unsorted element moves to its correct
	 * position at the end of the array.
	 *
	 * If no swaps occur during a pass, the array is already sorted and
	 * the algorithm terminates early.
	 *
	 * Best Time Complexity: O(n)
	 * Average Time Complexity: O(n²)
	 * Worst Time Complexity: O(n²)
	 * Space Complexity: O(1)
	 *
	 * @param arr the array to be sorted
	 */
	public static void bubbleSortArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean swapped = false;
			
			for (int j = 1; j < arr.length-i; j++) {
				
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
				
			}
			if(!swapped) {
				break;
			}
		}
	}
	
	/**
	 * Sorts the array in descending order using Bubble Sort.
	 *
	 * During each pass, the smallest unsorted element moves towards the
	 * end of the array, resulting in descending order.
	 *
	 * If the array is already sorted in descending order, no swaps occur,
	 * so the algorithm terminates after the first pass.
	 *
	 * Best Time Complexity: O(n)
	 * Average Time Complexity: O(n²)
	 * Worst Time Complexity: O(n²)
	 * Space Complexity: O(1)
	 *
	 * @param arr the array to be sorted
	 */
	public static void bubbleSortArrayDescending(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			boolean swapped = false;
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j]>arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] =temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

}
