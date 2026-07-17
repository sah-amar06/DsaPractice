package LeetCodeSortingProblems;

public class MaxProductOfThreeNum {

	public static void main(String[] args) {
		
		int[] nums = {-10,-20, -30, 1,3,5,7,15,55};
		int[] num1 = {1,2,3,6,9,11,10};
		int[] num2 = {2,3,4};
		System.out.println(getMaxProductOfThreeNum(nums));
		System.out.println(getMaxProductOfThreeNum(num1));
		System.out.println(getMaxProductOfThreeNum(num2));
		
		

	}
	
	public static int getMaxProductOfThreeNum(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			boolean swapped =false;
			
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		int n = arr.length;
		//Product of three largest number
		int product1 = arr[n-1]*arr[n-2]*arr[n-3];
		//Product of two smallest and one largest number.
		int product2 = arr[0]*arr[1]*arr[n-1];
		return Math.max(product1, product2);
	}
}
