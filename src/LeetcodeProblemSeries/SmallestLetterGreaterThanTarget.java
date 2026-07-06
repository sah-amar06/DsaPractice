package LeetcodeProblemSeries;

public class SmallestLetterGreaterThanTarget {
	
	//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

	public static void main(String[] args) {
		
		char[] ch = {'c', 'f', 'j'};
		System.out.println(getSmallestLetterGreaterThanTarget(ch, 'a'));
	}
	
	public static char getSmallestLetterGreaterThanTarget(char[] letters, char target) {
		
		
		int start =0; 
		int end = letters.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(letters[mid]>target) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return letters[start % letters.length];
	}

}
