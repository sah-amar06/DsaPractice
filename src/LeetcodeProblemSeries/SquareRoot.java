package LeetcodeProblemSeries;

public class SquareRoot {

	//https://leetcode.com/problems/sqrtx/submissions/2055042012/
	public static void main(String[] args) {
		
		System.out.println(getSquareRoot(9));
		System.out.println(getSquareRootBruteFrorce(11));

	}
	
	public static int getSquareRootBruteFrorce(int num) {
		
		if(num==0) {
			return 0;
		}
		
		for(int i=1; i<=num; i++) {
			
			//To avoid integer overflow for larger num
			long square = (long) i*i;
			
			if(square==num) {
				return i;
			}
			if(square>num){
				return i-1;
			}
		}
		// This statement is never reached logically.
		// It is present only to satisfy the Java compiler,
		// which requires every execution path to return a value.
		return num;
	}
	
	public static int getSquareRoot(int num) {
		
		if(num==0) {
			return 0;
		}
		
		int start =1;
		int end = num;
		int ans= 0;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			//To avoid integer overflow for larger num
			long square = (long) mid*mid;
			
			if(square==num) {
				return mid;
			}else if(square<num) {
				ans = mid;
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return ans;
	}

}
