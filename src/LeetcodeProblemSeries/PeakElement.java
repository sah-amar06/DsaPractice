package LeetcodeProblemSeries;

public class PeakElement {

	
	//https://leetcode.com/problems/find-peak-element/description/
	public static void main(String[] args) {
		
		int[] nums = {1,2,1,3,5,6,4};
		System.out.println(getPeak(nums));
		System.out.println(getPeakOptimal(nums));
		
		
		

	}

	/**
	 * A peak element is an array is strictly greater than both of its neighbors
	 * @param arr
	 * 
	 * Brute force approach
	 */
	public static int getPeak(int[] arr) {
		
		if(arr.length==1) {
			return -1;
		}
		
		if(arr[0]>arr[1]) {
			return -1;
		}
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static int getPeakOptimal(int[] arr) {
		
		int start =0; 
		int end = arr.length-1;
		
		while(start<end) {
			int mid= start+(end-start)/2;
			
			if(arr[mid]>arr[mid+1]) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return start;
	}
}
