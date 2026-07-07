package LeetcodeProblemSeries;

public class PeakInMountainArray {

	
	//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,3,1};
		System.out.println(findPeakInMountainArray(nums));
		

	}
	
	
	/**
	 * Peak in mountain array is the greatest element available in the array.
	 * @param arr
	 */
	public static int findPeakInMountainArray(int[] arr) {
		
		
		int start=0; 
		int end = arr.length-1;
		
		while(start<end) {
			int mid = start+(end-start)/2;
			/**
			 * If arr[mid] > arr[mid+1] means mid lies on the decreasing part.
			 * Since the peak lies at the beginning of the decreasing slope, mid itself can be the peak.
			 * However, there may still be a larger element on the left. 
			 */
			if(arr[mid]>arr[mid+1]) {
				end = mid;
			}
			/**
			 * If arr[mid] < arr[mid + 1], then mid lies on the increasing part of the mountain.
			 * Since the peak must be on the right, eliminate mid and everything before it.
			 */
			else {
				start = mid+1;
			}
			
		}
		return start;
		
	}

}
