package arrays;

import java.util.Arrays;

public class FirstAnLastPositionDescendingArray {

	public static void main(String[] args) {
		int[] nums = {90,80,70,60,50,50,50,50,50,40,40,30,20,10,10};
		
		int ans[] = getPositions(nums, 50);
		System.out.println(Arrays.toString(ans));
		int ansBS[] = getFirstAndLastPosition(nums, 40);
		System.out.println(Arrays.toString(ansBS));

	}
	
	
	//Linear Search Approach
	
	public static int[] getPositions(int[] arr, int target) {
		
		int first = -1;
		int last = -1;
		
		for(int index=0; index<arr.length; index++) {
			if(arr[index] == target) {
				if(first ==-1) {
					first = index;
				}
				last = index;
			}
			
		}
		return new int[] {first, last};
	}
	
	//Binary Search Approach
	
	public static int[] getFirstAndLastPosition(int[] arr, int target) {
		
		int ans[] = {-1,-1};
		
		ans[0] = search(arr, target, true);
		if(ans[0]!=-1) {
			ans[1] = search(arr, target, false);
		}
		
		return ans;
	}
	
	public static int search(int[] arr, int target, boolean firstIndex) {
		
		if(arr ==null || arr.length ==0) {
			return -1;
		}
		
		int start = 0; 
		int end = arr.length-1;
		int ans = -1;
		
		while(start<=end) {
			int mid = start +(end-start)/2;
			
			if(arr[mid] ==target) {
				ans = mid;
				if(firstIndex) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}else if(arr[mid]<target) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return ans;
	}
	

}
