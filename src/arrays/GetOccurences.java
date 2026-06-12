package arrays;

public class GetOccurences {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 6, 6, 6, 7, 8, 9, 6, 90, -5, 6 };
		int[] num = { 1, 2, 3, 4, 5, 6, 6, 6, 6, 7, 8, 9 };
		System.out.println(getOccureneces(nums, 6));
		System.out.println(getOccureneces(nums, 6));
		System.out.println(getOccurencesBS(num, 0));
		System.out.println(getOccurencesBS(num, 6));
	}

	public static int getOccureneces(int[] nums, int target) {

		int count = 0;

		for (int index = 0; index < nums.length; index++) {

			if (nums[index] == target) {
				count++;
			}

		}
		return count;
	}

	public static int getOccurencesBS(int[] arr, int target) {

		if (arr == null || arr.length == 0) {
			return -1;
		}

		int start = 0;
		int end = arr.length - 1;

		int firstOccurenec = -1;
		int lastOccurance = -1;
		int answer = 0;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				firstOccurenec = mid;
				end = mid-1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		
		if(firstOccurenec == -1) {
			return -1;
		}
		
		start = 0;
		end = arr.length - 1;
		
		while(start<=end) {
			int mid = start +(end-start)/2;
			
			if(arr[mid] == target) {
				lastOccurance = mid;
				start = mid+1;
			}else if(arr[mid] <target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		

		return answer = lastOccurance - firstOccurenec+1;
	}

}
