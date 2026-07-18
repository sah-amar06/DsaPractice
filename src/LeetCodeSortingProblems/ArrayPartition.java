package LeetCodeSortingProblems;

public class ArrayPartition {

	
	//https://leetcode.com/problems/array-partition/
	public static void main(String[] args) {
		int[] num = {6,2,6,5,1,2};
		System.out.println(getArrayPartitining(num));

	}
	
	
	public static int getArrayPartitining(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			boolean swapped = false;
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j]= arr[j-1];
					arr[j-1]= temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		int sum =0;
		for(int k=0; k<arr.length; k+=2) {
			sum= sum+arr[k];
		}
		return sum;
	}

}
