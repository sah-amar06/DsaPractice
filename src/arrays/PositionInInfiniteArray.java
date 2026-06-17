package arrays;

public class PositionInInfiniteArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,61,62,63,64};
		System.out.println(getPosition(nums, 62));
		System.out.println(getPositionInfinityArray(nums, 30));

	}

	
	public static int getPosition(int[]arr, int target) {
		
		   int index = 1;

	        while(arr[index]<target) {
	        	index *=2;
	        }
		
	        //i=index/2 :-> we know the target must be between the previous index and the current index.
	        //index *=2 :-> here we are doubling the index values to get the range of the Array where target element is available
	        //So, no need to search from 0 till the previously double index size. Hence, dividing the index/2 and then searching the target element in the remaning array.
	        
		for(int i=index/2; i<=index; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr, int target, int start, int end) {
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid]<target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}
	
	public static int getPositionInfinityArray(int[] arr, int target) {
		
		
		//First find the range, here I'm keeping the range of 2
		int start =0;
		int end = 1;
	
		//Condition for the target to be lie in the range
		while(arr[end]<target) {
			
			//In sorted array, if the target is greater than the elements available at the arr[end] which means target must available on the right side in the array. So, move the start just after end (which will be end+1)
			int newStart = end+1;  // This will be my new start
			
			//Double the range, 
			//end = previous end +size of the range*2;
			//Size of the range/box : end -(start-1)= (end-start+1)
			end = end + (end-start+1)*2;
			start = newStart;
			
		}
		
		return binarySearch(arr, target, start, end);
	}
}
