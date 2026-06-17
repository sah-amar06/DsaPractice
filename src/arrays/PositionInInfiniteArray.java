package arrays;

public class PositionInInfiniteArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,61,62,63,64};
		System.out.println(getPosition(nums, 62));

	}

	
	public static int getPosition(int[]arr, int target) {
		
		
		
		for(int index=0; index<=2; index++) {
			if(arr[index] == target) {
				return index;
			}else {
				index = index*2;
			}
		}
		return -1;
	}
}
