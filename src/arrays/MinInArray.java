package arrays;

public class MinInArray {

	public static void main(String[] args) {
		int[] arr = {-10, 1,2,3,-400,5,6,7,8,9,-20};
		System.out.println(minArray(arr));
		System.out.println(minInRange(arr, 2, 6));
		
		
	}
	
	public static int minArray(int[] arr) {
		
		if(arr == null || arr.length==0) {
			return -1;
		}
		int min = arr[0];
		for(int index=1; index<arr.length; index++ ) {
			if(arr[index]<min) {
				min = arr[index];
			}
		}
		return min;
	}
	
	public static int minInRange(int[] arr, int start, int end) {
		
		if(arr==null || arr.length==0) {
			return -1;
		}
		
		if(start<0 || end >=arr.length || start>end) {
			return -1;
		}
		
		int min = arr[start];
		
		for(int index= start+1; index<=end; index++) {
			if(arr[index]<min) {
				min = arr[index];
				
			}
		}
		return min;
		
	}

}
