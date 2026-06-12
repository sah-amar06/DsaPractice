package arrays;

public class FloorNumber {

	public static void main(String[] args) {

		int[] nums = { 1, 5, 9, 11, 16, 19, 22, 30, };
		int[] nums1 = {90,80,70,60,50,40,30,20,10};
		System.out.println(getFloor(nums, 13));
		System.out.println(getFloor(nums1, 25));

	}

	/**
	 * floor number is nearest smaller than or equal to the target number
	 * @param arr
	 * @param target
	 * @return
	 */
	public static int getFloor(int[] arr, int target) {

		if (arr == null || arr.length == 0) {
			return -1;
		}


		boolean flag = false;

		if (arr[0] < arr[arr.length - 1]) {
			flag = true;
		}
		
		if(flag) {
			if (target < arr[0]) {
				return -1;
			}
		}else {
			if(target < arr[arr.length-1]) {
				return -1;
			}
		}
		
		int start = 0, end = arr.length - 1;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (flag) {
				if (arr[mid] < target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (arr[mid] > target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}

		}
		return flag ? end : start;

	}

}
