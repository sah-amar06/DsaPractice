package LeetcodeProblemSeries;

public class MaxConsecutiveOnes {

	// https://leetcode.com/problems/max-consecutive-ones/description/
	public static void main(String[] args) {

		int[] nums = { 1, 1, 1,1,1,0, 1, 1, 1 };
		System.out.println(maxConsecutiveOnes(nums));
		System.out.println(getMaxConsecutiveOnes(nums));

	}

	/**
	 * Given a binary array nums, return the maximum number of consecutive 1's in
	 * the array.
	 * 
	 * 
	 */
	
	public static int maxConsecutiveOnes(int[] arr) {
		
		
		int count =0;
		int ans = 0;
		
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == 0) {
				count = 0;
			}else {
				count++;
				ans = Math.max(ans, count);
				
				/**
				 * Approach:
				 * Traverse the array and count the consecutive 1's.
				 *
				 * - If the current element is 1:
				 *      Increment the count and update the maximum consecutive count using
				 *      Math.max(ans, count).
				 *
				 * - If the current element is 0:
				 *      Reset the count to 0 because the consecutive sequence of 1's is broken.
				 *
				 * The variable 'ans' always stores the maximum consecutive 1's found so far.
				 *
				 * Example:
				 * Input: [1,1,1,0,1,1]
				 *
				 * i=0 -> count=1, ans=1
				 * i=1 -> count=2, ans=2
				 * i=2 -> count=3, ans=3
				 * i=3 -> count=4, ans=4
				 * i=4 -> count=5, ans=5
				 * i=3 -> count=0, ans=5   // Sequence breaks
				 * i=4 -> count=1, ans=5
				 * i=5 -> count=2, ans=5
				 *
				 * Final Answer = 5
				 *
				 * Time Complexity: O(n)
				 * Space Complexity: O(1)
				 */
			}
		}
		return ans;
	}
	
	public static int getMaxConsecutiveOnes(int[] arr) {
		
		
		int count = 0;
		int ans = 0;
		
		for(int nums:arr) {
			if(nums==1) {
				count++;
				ans = Math.max(ans, count);
			}else {
				count=0;
			}
		}
		return ans;
	}

}
