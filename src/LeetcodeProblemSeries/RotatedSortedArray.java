package LeetcodeProblemSeries;

public class RotatedSortedArray {
	
	
	//https://leetcode.com/problems/search-in-rotated-sorted-array/

	public static void main(String[] args) {
		
		int[] nums = {5,6,7,8,9,1,2,3,4};
		System.out.println(search(nums, 8));
		int[] nums1 = {6,7,1,2,3,4,5};
		System.out.println(search(nums1, 6));
		

	}
	
	public static int getPivot(int[] arr) {
		
		int start =0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(mid < end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			
			if(mid > start && arr[mid]<arr[mid-1]) {
				return  mid-1;
			}
			
			if(arr[mid] <= arr[start]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
			
			
		}
		return -1;
	}
	
	
	public static int binarySearch(int[] arr, int target, int start, int end) {
		
		
		while(start<=end) {
			
			int mid = start +(end-start)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid]>target) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return -1;
	}
	
	
	public static int search(int[] arr, int target) {
		
		int pivot = getPivot(arr);
		
		
		//If we did not find the pivot, it means array is not rotated. Do normal binary search.
		if(pivot==-1) {
			return binarySearch(arr, target, 0, arr.length-1);
		}
		
		//If pivot is found, we have two sorted ascending array.
		
		//Case1 : If the pivot itself is the target, return it immediately.
		if(arr[pivot] == target) {
			return pivot;
		}
		
		//case2: If arr[start]<arr[pivot]. means my target element is available before pivot.
		//start = pivot -1;
		
		if(arr[0]<=target && target<=arr[pivot]) {
			return binarySearch(arr, target, 0, pivot-1);
		}
		
		return binarySearch(arr, target, pivot+1, arr.length-1);
		
	}
	

}
