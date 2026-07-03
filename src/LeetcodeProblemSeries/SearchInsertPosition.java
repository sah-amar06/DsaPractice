package LeetcodeProblemSeries;

public class SearchInsertPosition {
	
	
	//https://leetcode.com/problems/search-insert-position/description/
	public static void main(String[] args) {
		
		int[] nums = {1,3,5,6};
		System.out.println(searchInsert(nums, 2));
		
		int[] nums1 = {1,3,5,6};
		System.out.println(searchInsert(nums1, 7));
		
		
	}
	
	
	public static int searchInsert(int[] arr, int target) {
		
		int start =0;
		int end = arr.length-1;
		
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
		return start;
	}

}
