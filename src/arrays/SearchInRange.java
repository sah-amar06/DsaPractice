package arrays;

public class SearchInRange {

	public static void main(String[] args) {
		
		int[] num = {1,2,44,99,19, 9, 78};
		System.out.println(searchInRange(num, 2, 5, 19));

	}

	/**
	 * Return the index of the target element within the given range. 
	 * return -1 if target element is not found in the given range
	 * @param num
	 * @param start
	 * @param end
	 * @param target
	 * @return
	 */
	public static int searchInRange(int[] num, int start, int end, int target) {
		
		if(num == null || num.length==0) {
			return -1;
		}
		
		if(start<0 || end >= num.length || start>end) {
			return -1;
		}
		
		for(int index=start; index<=end; index++) {
			if(num[index] == target) {
				return index;
			}
		}
		return -1;
	}
}
