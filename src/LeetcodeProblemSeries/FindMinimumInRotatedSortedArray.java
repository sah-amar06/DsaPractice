package LeetcodeProblemSeries;

public class FindMinimumInRotatedSortedArray {

	// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
	public static void main(String[] args) {

		int[] nums = { 3, 4, 5, 1, 2 };
		System.out.println(getMinimum(nums));

		int[] nums1 = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int[] nums2 = { 5, 6, 7, 8, 9, 2, 3, 4 };
		System.out.println(getMinimum(nums1));
		System.out.println(getMinimumBruteForce(nums1));
		System.out.println(getMinimumBruteForce(nums2));
		System.out.println(getMinimumBS(nums2));
		System.out.println(getMinimumBruteForce2(nums1));

	}

	public static int getMinimum(int[] arr) {
		int pivot = findPivot(arr);

		if (pivot == -1) {
			return arr[0];
		}

		return arr[pivot + 1];
	}

	/**
	 * Observation:
	 *
	 * In a rotated sorted array, the minimum element always appears immediately
	 * after the pivot (largest element).
	 *
	 * Therefore,
	 *
	 * 1. Find the pivot. 2. If no pivot exists, the array is not rotated and the
	 * first element is the minimum. 3. Otherwise, return arr[pivot + 1].
	 */

	public static int findPivot(int[] nums) {

		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (mid < end && nums[mid] > nums[mid + 1]) {
				return mid;
			}

			if (mid > start && nums[mid] < nums[mid - 1]) {
				return mid - 1;
			}

			if (nums[mid] <= nums[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static int getMinimumBruteForce(int[] nums) {

		int min = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];

			}
		}
		return min;

	}
	
	
	public static int getMinimumBruteForce2(int[] nums) {
		
		int min = nums[0];
		
		for(int e:nums) {
			min = Math.min(e, min);
		}
		return min;
	}

	public static int getMinimumBS(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			
			if(arr[mid]>arr[end]) {
				start = mid+1;
			}else {
				end = mid;
			}

		}
		return arr[start];
	}

}
