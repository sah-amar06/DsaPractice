package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		int[]ans = getTwoSum(arr, 18);
		System.out.println(Arrays.toString(ans));
		
		int answer[] = getTwoSumOptimal(arr, 13);
		System.out.println(Arrays.toString(answer));

	}
	
	/**
	 * Brute forec
	 * @param arr
	 * @param target
	 */
	public static int[] getTwoSum(int[] arr, int target) {
		
		if(arr ==  null || arr.length==0) {
			return new int[] {-1,-1};
		}
		
		for(int outer=0; outer<arr.length-1; outer++) {
			
			for(int inner = outer+1; inner<arr.length; inner++) {
				if(arr[outer] + arr[inner] == target) {
					return new int[] {outer, inner};
				}
			}
			
		}
		return new int[] {-1, -1};
		
	}
	
	public static int[] getTwoSumOptimal(int[] arr, int target) {
		if(arr == null || arr.length==0) {
			return new int[] {-1,-1};
		}
		
		HashMap<Integer, Integer> myMap = new HashMap<>();
		
		for(int index = 0; index<arr.length; index++) {
			int complimenet = target-arr[index];
			
			if(myMap.containsKey(complimenet)) {
				return new int[] {myMap.get(complimenet), index};
			}
			myMap.put(arr[index], index);
		}
		
		return new int[] {-1, -1};
		
	}
	

}
