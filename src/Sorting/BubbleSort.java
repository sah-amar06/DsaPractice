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
	
	
	public static void bubbleSortArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean swaped = false;
			
			for (int j = 1; j < arr.length-i; j++) {
				
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swaped = true;
				}
				
			}
			if(!swaped) {
				break;
			}
		}
	}
	
	public static void bubbleSortArrayDescending(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			boolean swaped = false;
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j]>arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] =temp;
					swaped = true;
				}
			}
			if(!swaped) {
				break;
			}
		}
	}

}
