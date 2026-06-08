package arrays;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		int[] arr = {2,6,7,9,11,55,10};
		swap(arr, 2, 4);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void swap(int[] arr, int index1, int index2) {
		
		if(arr == null || arr.length==0) {
			return;
		}
		
		if(index1 <0 || index2 < 0 || index1>=arr.length || index2>=arr.length) {
			return;
		}
		
		int temp =arr[index1];
		
		arr[index1]= arr[index2];
		arr[index2] =temp;
	}

}
