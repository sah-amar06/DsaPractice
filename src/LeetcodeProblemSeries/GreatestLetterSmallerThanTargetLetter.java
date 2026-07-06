package LeetcodeProblemSeries;

public class GreatestLetterSmallerThanTargetLetter {

	public static void main(String[] args) {
		
		char[] ch = {'a', 'd', 'g' , 'k'};
		System.out.println(getGreatestLetter(ch, '0'));
		char[] ch1 = {'c', 'd', 'g' , 'k'};
		System.out.println(getGreatestLetterNonCircular(ch1, 'b'));

	}
	
	
	public static char getGreatestLetter(char[] letters, char target) {
		
		int start=0;
		int end = letters.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(letters[mid]<target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		//end points to the last element smaller than the target.
		return letters[(end+letters.length) % letters.length];
	}
	
	public static char getGreatestLetterNonCircular(char[] letters, char target) {
		
		int start =0; 
		int end = letters.length-1;
		
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			if(letters[mid]<target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		if(end==-1) {
			return '#';
		}else {
			return letters[end];
		}
	}

}
