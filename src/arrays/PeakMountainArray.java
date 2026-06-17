package arrays;

public class PeakMountainArray {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,4,3,2,0};
		System.out.println(peakIndexInMountainArray(nums));

	}
	
	public static int peakIndexInMountainArray(int[] arr) {
		
		int start=0;
		int end= arr.length-1;
		
		while(start<end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] > arr[mid+1]) {
				//I'm in decreasing part of the Array. 
				//This may be answer(peak) but look at left.So, my end will move to the mid and mid will become my new end.
				end = mid;
			}else {
				//I'm in ascending part of the Array. Move start just after end. mid+1
				start = mid+1;
			}
			
		}
		return start;
	}

}
