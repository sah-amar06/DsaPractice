package LeetcodeProblemSeries;

public class RotatedSortedArrayWithDuplicates {
	
	//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

	public static void main(String[] args) {
		int[] nums = {2,5,6,0,0,1,2};
		System.out.println(search(nums, 0));
		
		
		System.out.println(search(nums, 3));

	}
	
	
	public static int findPivotWithDuplicates(int[] arr) {
		
		int start =0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(end > mid && arr[mid]>arr[mid+1]) {
				return mid;
			}
			
			if(start < mid && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			
			if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
				//skip the duplicates
				
				//If duplicate is pivot
				//Check if start is pivot
				if(arr[start]>arr[start+1]) {
					return start;
				}
				//If start is not pivot the skip the start(i.e. move start pointer to next element 
				start++;
				
				
				//Check if end is pivot
				if(arr[end]<arr[end-1]) {
					return end-1;
				}
				//If end is not pivot. skip the end (end= end--).
				end--;
			}
			
			else if(arr[start]<arr[mid] || arr[start] == arr[mid] && arr[mid] >arr[end]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
			
		}
		return -1;
		
	}
	
	
	public static int binarySearch(int[] arr, int target, int start, int end) {
		
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}
	
	public static int search(int[] nums, int target) {
		
		int pivot = findPivotWithDuplicates(nums);
		
		if(pivot == -1) {
			return binarySearch(nums, target, 0, nums.length-1);
		}
		
		if(nums[pivot] == target) {
			return pivot;
		}
		
		if(nums[0]<=target && target<=nums[pivot]) {
			return binarySearch(nums, target, 0, pivot-1);
		}
		
		return binarySearch(nums, target, pivot+1, nums.length-1);
        
    }

}
