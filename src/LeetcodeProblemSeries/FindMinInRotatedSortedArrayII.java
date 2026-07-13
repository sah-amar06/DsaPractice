package LeetcodeProblemSeries;

public class FindMinInRotatedSortedArrayII {
	
	//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

	public static void main(String[] args) {
		
		int[] nums = {2,2,2,0,1};
		System.out.println(getMinBS(nums));
		System.out.println(getMinimumIndex(nums));
		

	}
	
	
	public static int getMinBS(int[] arr) {
		
		int start =0;
		int end = arr.length-1;
		
		while(start<end) {
			int mid = start+(end-start)/2;
			
			if(arr[mid]==arr[end]) {
				end--;
			}else if(arr[mid]>arr[end]) {
				start=mid+1;
			}else {
				end = mid;
			}
		}
		return arr[start];
		//return arr[end];
	}
	
	public static int getPivot(int[] arr) {
		
		
		int start =0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			
			if(mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			
			
			//Skip the duplicates and reduce the search range
			if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
				
				//Check if start is pivot or not
				
				if(start<end && arr[start]>arr[start+1]) {
					return start;
				}
				start++;
				
				
				//Check if end is pivot or not
				if(end>start && arr[end]<arr[end-1]) {
					return end-1;
				}
				end--;
				
				//Check which halves is sorted 
			}else if((arr[start]<arr[mid]) || arr[start]==arr[mid] && arr[mid]>arr[end]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}
	
	
	public static int getMinimumIndex(int[] arr) {
		
		int pivot =getPivot(arr);
		
		if(pivot==-1) {
			return pivot;
		}
		
		return pivot+1;
	}

}
