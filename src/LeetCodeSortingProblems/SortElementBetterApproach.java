package LeetCodeSortingProblems;

import java.util.Arrays;

public class SortElementBetterApproach {

	public static void main(String[] args) {
		int[] nums = {1,2,1,2,0,1,0,1,0,0,1,1,2,0};
		sortElements(nums);
		System.out.println(Arrays.toString(nums));

	}
	
	
	public static void sortElements(int[] arr) {
		
		int zeroCount =0, oneCount=0, twoCount=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				zeroCount++;
			}else if(arr[i]==1) {
				oneCount++;
			}else {
				twoCount++;
			}
		}
		
		for(int i=0; i<zeroCount; i++) {
			arr[i] =0;
		}
		for(int i=zeroCount; i<zeroCount+oneCount; i++) {
			arr[i]=1;
		}
		for(int i=zeroCount+oneCount; i<arr.length; i++) {
			arr[i] =2;
		}
	}

}
