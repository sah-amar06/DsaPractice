package arrays;

public class SortedArrayCheck {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,10,7,8};
		System.out.println(isSorted(num));

	}
	
	/**
	 * If the given element at index is greater than the index+1, 
	 * return false else return true
	 * @param arr
	 * @return
	 */
	public static boolean isSorted(int[] arr) {
		
		if(arr == null || arr.length == 0) {
			return false;
		}
		
		for(int index=0; index<arr.length-1; index++) {
			if(arr[index]> arr[index+1]) {
				return false;
			}
		}
		return true;
	}

}
