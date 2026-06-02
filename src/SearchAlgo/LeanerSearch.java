package SearchAlgo;

public class LeanerSearch {

	public static void main(String[] args) {
		int[] number = {1,2,5,11,10, 90, 88, 76, 95};
		int target = 5;
		System.out.println(getTargetNumber(null, 0));
		System.out.println(getTargetNumber(number, target));

	}
	
	
	/**
	 * 
	 * @param num
	 * @param target
	 */
	public static int getTargetNumber(int num[], int target) {
		
		if(num == null || num.length==0  ) {
			return -1;
		}
		
		for(int start=0; start<num.length; start++) {
			
			if(num[start]==target) {
				return start;
			}
		}
		return -1;
		
	}

}
