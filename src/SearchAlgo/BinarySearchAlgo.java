package SearchAlgo;

public class BinarySearchAlgo {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		int[] num = {};

		System.out.println(binarySearch(number, 11));
		System.out.println(binarySearch(number, 19));
		System.out.println(binarySearch(num, 1));

	}

	public static int binarySearch(int nums[], int target) {

		if (nums == null || nums.length == 0) {
			return -1;
		}

		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return mid;
			}

			if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;

	}

}
