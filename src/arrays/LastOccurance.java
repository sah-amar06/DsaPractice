package arrays;

public class LastOccurance {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 11 };
		System.out.println(getLastOccurance(nums, 9));
		System.out.println(getLastOccurance(nums, 15));

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

}
