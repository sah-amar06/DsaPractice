package TwoPointers;

public class ReverseVowelsOfString {
	
	//https://leetcode.com/problems/reverse-vowels-of-a-string/description/

	public static void main(String[] args) {
		String str = "IceCreAm";
		System.out.println(reverseVowels(str));

	}
	
	
	/**
	 * Two pointer technique
	 * When both pointer have vowels, swap them 
	 * if left have vowel and right is not a valid vowel, the right--(until a new vowel found)
	 * if left is not a valid vowel, left++(until a new vowel)
	 * @param str
	 */
	public static String reverseVowels(String str) {
		
		char[] chars = str.toCharArray();
		
		int left =0;
		int right= chars.length-1;
		
		while(left<right) {
			
			while(left<right && !isVowel(chars[left])) {
				left++;
			}
			while(left<right && !isVowel(chars[right])) {
				right--;
			}
			
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		return new String(chars);
		
	}
	
	public static boolean isVowel(char ch) {
		 return ch == 'a' || ch == 'e' || ch == 'i' ||
		           ch == 'o' || ch == 'u' ||
		           ch == 'A' || ch == 'E' || ch == 'I' ||
		           ch == 'O' || ch == 'U';
	}

}
