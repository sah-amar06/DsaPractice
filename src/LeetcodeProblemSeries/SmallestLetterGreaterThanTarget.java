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
				// letters[mid] is a possible answer because it is greater than target.
	            // However, there might be another letter on the left that is also greater
	            // than the target but smaller than letters[mid].
	            // So, continue searching on the left.
				end = mid-1;
			}else {
				 // letters[mid] <= target
	            // This letter cannot be the answer because we need a strictly greater letter.
	            // Search in the right half.
				start = mid+1;
			}
		}
		// After the loop:
	    // 'start' points to the smallest letter greater than the target.
	    //
	    // If the target is greater than or equal to every letter in the array,
	    // start becomes letters.length.
	    //
	    // Using modulo wraps the index back to 0 because the array is circular.
		return letters[start % letters.length];
	}

}
