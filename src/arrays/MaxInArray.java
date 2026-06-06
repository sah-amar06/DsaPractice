package arrays;

public class MaxInArray {

	public static void main(String[] args) {
		int[] arr = {22,56,11,90, 12};
		
		System.out.println(findMax(arr));

	}
	
	public static int findMax(int[] arr) {
		
		if(arr == null || arr.length ==0) {
			return -1;
		}
		
		int max = arr[0];
		
		for(int index = 1; index<arr.length; index++) {
			if(arr[index]>max) {
				max = arr[index];
			}
		}
		return max;
	}

}
