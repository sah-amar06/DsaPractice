package arrays;

public class FirstOccurance {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4,4,4,4,7, 7, 8, 9, 13, 13, 13,40 };
		System.out.println(getFirstOccurance(arr, 7));
		System.out.println(getFirstOccuranceBS(arr, 13));
		System.out.println(getFirstOccuranceBS(arr, 4));
		System.out.println(getFirstOccuranceBS(arr, 50));

	}

	public static int getFirstOccurance(int[] arr, int target) {

		if (arr == null || arr.length == 0) {
			return -1;
		}

		for (int index = 0; index < arr.length; index++) {

			if (arr[index] == target) {

				return index;
			}
		}
		return -1;

	}
	
	public static int getFirstOccuranceBS(int[] arr, int target) {
		
		if(arr==null || arr.length ==0) {
			return -1;
		}
		
		if(target > arr[arr.length-1]) {
			return -1;
		}
		
		int start =0, end = arr.length-1;
		
		int answer = -1;
		while(start<=end) {
			
			int mid  = start + (end-start)/2;
			
			
			if(arr[mid] == target) {
				answer = mid;
				end = mid-1;
			}else if(arr[mid]<target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		return answer;
	}

}
