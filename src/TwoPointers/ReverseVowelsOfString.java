package TwoPointers;

public class ReverseVowelsOfString {
	
	//https://leetcode.com/problems/reverse-vowels-of-a-string/description/

	public static void main(String[] args) {
		String str = "IceCreAm";
		System.out.println(reverseVowels(str));

	}
	
	
	// Move left pointer until it points to a vowel
	// Move right pointer until it points to a vowel
	// Swap the vowels
	// Move both pointers inward
	public static String reverseVowels(String str) {
		
		char[] chars = str.toCharArray();
		
		int left =0;
		int right= chars.length-1;
		
		while(left<right) {
			//if left is not a valid vowel, left++(until a new vowel)
			while(left<right && !isVowel(chars[left])) {
				left++;
			}
			//if left have vowel and right is not a valid vowel, the right--(until a new vowel found)
			while(left<right && !isVowel(chars[right])) {
				right--;
			}
			
			//When both pointer have vowels, swap them 
			swap(chars, left, right);
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
	
	public static void swap(char[] arr, int left, int right) {
		char temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

}
