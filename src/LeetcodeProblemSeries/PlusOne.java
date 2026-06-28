package LeetcodeProblemSeries;

import java.util.Arrays;

public class PlusOne {

	// https://leetcode.com/problems/plus-one/description/

	public static void main(String[] args) {

		int[] num = { 1, 2, 3 };
		//getPlusOne(num);
		System.out.println(Arrays.toString(plusOneBruteForce(num)));
		int[] num1 = {9,9};
		System.out.println(Arrays.toString(plusOneUsingInteger(num1)));
		int[] num2 = {9,9,9,9,9,9,9,9,9,9,9,9};
		System.out.println(Arrays.toString(plusOneOptimal(num2)));
		
		int[] num3 = {1,2,3,4,5};
		System.out.println(Arrays.toString(plusOneOptimal(num3)));
	
		int[] num4 = {1,2,3,9,9};
		System.out.println(Arrays.toString(plusOneOptimal(num4)));
		
		

	}

	public static int[] plusOneBruteForce(int[] arr) {

		int product = 0;
		
		int[] nums = new int[arr.length];
		int index = nums.length-1;

		for (int i = 0; i < arr.length; i++) {

			product = product * 10 + arr[i];

		}
		product ++;
		
		
		
		while(product>0) {
			int lastDigit = product%10;
			product = product/10;
			
			nums[index] = lastDigit;
			index--;
			
		}
		return nums;
		
		

	}
	
	public static int[] plusOneUsingInteger(int[] arr) {
		
		int product =0;
		
		for(int nums:arr) {
			product = product*10+nums;
		}
		product++;
		
		
		int temp = product;
		int count = 0;
		
		while(temp>0) {
			temp = temp/10;
			count++;
		}
		
		int[] ans = new int[count];
		int index = count-1;
		
		while(product>0) {
			int lastDigit = product%10;
			product/=10;
			
			
			ans[index] = lastDigit;
			index--;
		}
		return ans;
	}
	
	public static int[] plusOneOptimal(int[] arr) {
		
		for(int i=arr.length-1; i>=0; i--) {
			
			if(arr[i]<9) {
				arr[i]++;
				return arr;
			}
			arr[i] =0;
		}
		
		int[] ans = new int[arr.length+1];
		ans[0] = 1;
		return ans;
	}

}
