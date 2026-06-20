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
	 * If Array is sorted in ascending order. No further sorting operation will happen and directly come out from the loop
	 * as if(!swaped) {
				break;
			}
	 *Best T.C = O(n)
	 *
	 * @param arr
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
	 * If Array is sorted in Ascending order. It will perform the sorting operation to sort in descending order.
	 * Best Time Complexity : O(n2)
	 * If Array is sorted in descending order. No sorting will happen. 
	 * Best T.C = O(n)
	 * @param arr
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
