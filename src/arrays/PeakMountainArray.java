package arrays;

public class PeakMountainArray {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,4,3,2,0};
		System.out.println(peakIndexInMountainArray(nums));
		System.out.println(peakIndexInMountainArrayBruteForce(nums));
		System.out.println(peakInMountainArrayBruteForce(nums));

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
		//When start and end pointing to the same index. That index will be our peak in the given Array.
		//return start/end
		return end;
	}
	
	/**
	 * In brute force approach, initializing the index from 1 and checking that index is greater than the element available on the left side (index-1)
	 * and element available on the right side(index+1). 
	 * If the element at the current index is greater than the left and right side of the elements. 
	 * Then we found the "peak" in the given "Mountain Array"
	 * @param arr
	 * @return
	 */
	public static int peakIndexInMountainArrayBruteForce(int[] arr) {
		
		for(int index =1; index<arr.length-1; index++) {
			if(arr[index] > arr[index-1] && arr[index] > arr[index+1] ) {
				return index;
			}
		}
		
		return -1;
	}
	
	/**
	 * Another approach: If the current element is greater than the element available on the right side.
	 * Then that element is the peak in the mountain array(Because a Mountain Array has exactly one peak).
	 * @param arr
	 * @return
	 */
	
	public static int peakInMountainArrayBruteForce(int[] arr) {
		int peak =0;
		
		for(int index=1; index<arr.length; index++) {
			if(arr[index]>arr[peak]) {
				peak = index;
			}
		}
		return peak;
	}
	

}
