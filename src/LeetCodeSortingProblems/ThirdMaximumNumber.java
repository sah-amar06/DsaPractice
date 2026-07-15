package LeetCodeSortingProblems;

public class ThirdMaximumNumber {

	
	//https://leetcode.com/problems/third-maximum-number/
	public static void main(String[] args) {
		int[] nums = {7,5};
		int[] num1 = {2,5,6,7,9,1,11};
		System.out.println(getThirdMaximumNumber(nums));
		System.out.println(getThirdMaximumNumber(num1));

	}
	
	public static int getThirdMaximumNumber(int[] nums) {
		
		
		for(int i=0; i<nums.length; i++) {
			
			boolean swapped = false;
			for(int j=1; j<nums.length-i; j++) {
				if(nums[j]<nums[j-1]) {
					int temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = temp;
					swapped = true;
				}
		
			}
			if(!swapped) {
				break;
			}
				
		}
		int count =1;
		//Here, we will get the largetest element of the array. 
		//Since array is already sorted. that's why the last element will be largest element of the array.
		//If count!=3, then we will get the largest element of the array as an output.
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
