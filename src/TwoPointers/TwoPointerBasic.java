package TwoPointers;

public class TwoPointerBasic {

	public static void main(String[] args) {
		String name = "Amar";
		System.out.println(reverseStringBruteForce(name));
		System.out.println(reverseStringTwoPointer(name));
		System.out.println(reverseStringStringBuilder(name));
		System.out.println(reverseStringusingStringBuffer(name));

	}
	
	public static String reverseStringBruteForce(String str) {
		
		char[] chars = str.toCharArray();
		
		String temp = "";
		for(int i = chars.length-1; i>=0; i--) {
			temp = temp+chars[i];
		}
		return temp;
	}
	
	
	/**
	 * Time complexity = O(N) - Ran through one while loop.
	 * Space complexity = O(n)-char[] took an extra space
	 * @param str
	 * @return
	 */
	public static String reverseStringTwoPointer(String str) {
		char[] chars = str.toCharArray();
		
		int left =0; 
		int right= chars.length-1;
		
		
		while(left<right) {
			
			//Swap the left and right characters
			char tempChars = chars[left];
			chars[left] = chars[right];
			chars[right] = tempChars;
			//Move pointers towards each other
			left++;
			right--;
		}
		return new String(chars);
	}
	
	public static String reverseStringStringBuilder(String str) {
		
		
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public static String reverseStringusingStringBuffer(String name) {
		
		StringBuffer buffer = new StringBuffer();
		
		for(int i=name.length()-1; i>=0; i--) {
			buffer.append(name.charAt(i));
		}
		return buffer.toString();
	}

}
