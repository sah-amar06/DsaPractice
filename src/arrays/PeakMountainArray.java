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
	 * brute force approach, 
	 * Iterate through the array from index 1 to arr.length - 2 and check whether
	 * the current element is greater than both its left and right neighboring elements.
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
	 * Since a valid mountain array contains exactly one peak, the peak element is
	 * always the maximum element in the array.
	 *
	 * Iterate through the array and keep track of the index of the maximum element.
	 * Return the index of the maximum element after the traversal.
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
