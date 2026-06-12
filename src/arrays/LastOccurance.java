package arrays;

public class LastOccurance {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9, 9, 10, 11 };
		System.out.println(getLastOccurance(nums, 9));
		System.out.println(getLastOccurance(nums, 15));
		System.out.println(getLastOccuranceBS(nums, 5));

	}

	public static int getLastOccurance(int[] arr, int target) {

		if (arr == null || arr.length == 0) {
			return -1;
		}

		if (target > arr[arr.length - 1]) {
			return -1;
		}

		int last = -1;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == target) {
				last = index;
			}

		}
		return last;
	}
	
	public static int getLastOccuranceBS(int[] arr, int target) {
		
		if(arr == null || arr.length==0) {
			return -1;
		}
		
		if(target < arr[0]   || target>arr[arr.length-1]) {
			return -1;
		}
		
		int answer = -1;
		int start = 0, end = arr.length-1;
		
		while(start<=end) {
			
			int mid = start + (end-start)/2;
			
			if(arr[mid] == target) {
				answer = mid;
				start = mid+1;	
			}else if(arr[mid] < target) {  
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return answer;
	}

}
