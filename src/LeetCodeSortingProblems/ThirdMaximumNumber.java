package LeetCodeSortingProblems;

public class ThirdMaximumNumber {

	
	//https://leetcode.com/problems/third-maximum-number/
	public static void main(String[] args) {
		int[] nums = {2,2,3,1};
		System.out.println(getThirdMaximumNumber(nums));

	}
	
	public static int getThirdMaximumNumber(int[] nums) {
		
		
		for(int i=0; i<nums.length; i++) {
			for(int j=1; j<nums.length-i; j++) {
				if(nums[j]<nums[j-1]) {
					int temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = temp;
				}
				
			}
				
		}
		int count =1;
		int max = nums[nums.length-1];
		for(int k=nums.length-2; k>=0; k--) {
			if(nums[k]!=nums[k+1]) {
				count++;
				
				if(count==3) {
					return nums[k];
				}
			}
		}
		return max;
	}

}
