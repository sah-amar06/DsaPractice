package TwoPointers;

public class PalindromeCheck {

	//https://leetcode.com/problems/valid-palindrome/description/
	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		System.out.println(validPalindrome(s));
		System.out.println(palindromeCheck(s));
		

	}
	
	public static boolean validPalindrome(String str) {
		
		char[] chars = str.toCharArray();
		
		for(int i=0; i<chars.length; i++) {
			chars[i] = Character.toLowerCase(chars[i]);
		}
		
		int left =0; 
		int right= chars.length-1;
		
		while(left<right) {
			
			while (left < right && !Character.isLetterOrDigit(chars[left])) {
			    left++;
			}

			while (left < right && !Character.isLetterOrDigit(chars[right])) {
			    right--;
			}
			
			if(chars[left]!=chars[right]) {
				return false;
			}
			left++;
			right--;
			
		}
		return true;
	}
	
	public static boolean palindromeCheck(String str) {
		
		int left =0; 
		int right= str.length()-1;
		
		while(left<right) {
			while(left<right && !Character.isLetterOrDigit(str.charAt(left))) {
				left++;
			}
			while(left<right && !Character.isLetterOrDigit(str.charAt(right))) {
				right--;
			}
			
			if(Character.toLowerCase(str.charAt(left))
					!= Character.toLowerCase(str.charAt(right))) {
				return false;
			}
			
			left++;
			right--;
		}
		return true;
	}

}
