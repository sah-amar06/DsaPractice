package LeetCodeSortingProblems;

public class HeightChecker {
	
	
	//https://leetcode.com/problems/height-checker/

	public static void main(String[] args) {
		int[] heights = {1,1,4,2,1,3};
		System.out.println(heightChecker(heights));
		

	}
	
	public static int heightChecker(int[] arr) {
		
		int[] expected = arr.clone();
		
		for(int i=0; i<expected.length; i++) {
			for(int j=1; j<expected.length-i; j++) {
				if(expected[j]<expected[j-1]) {
					int temp = expected[j];
					expected[j] = expected[j-1];
					expected[j-1] =temp;
				}
			}
		}
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=expected[i]) {
				count++;
			}
		}
		return count;
	}

}
