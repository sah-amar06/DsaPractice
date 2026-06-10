package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5};
		reverseArray(num);
		System.out.println(Arrays.toString(num));
		reverseTwoPointer(num);
		System.out.println(Arrays.toString(num));

	}
	
	public static void reverseArray(int[] arr) {
		
		if(arr ==null || arr.length ==0) {
			return ;
		}
		
		for(int index =arr.length-1; index>=0; index--) {
			System.out.print(arr[index] + " ");
		}
	}
	
	public static void reverseTwoPointer(int[] arr) {
		
		if(arr ==null || arr.length == 0) {
			return ;
		}
		
		int start = 0;
		int end =arr.length-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
				
		
	}

}
