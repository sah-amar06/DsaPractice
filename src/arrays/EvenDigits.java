package arrays;

public class EvenDigits {

	public static void main(String[] args) {

		int[] num = { 2, 33, 19, 222, 1000 };

		int[] nums = { -22, 33, 222, 100, 1090, 0000, -1234 };
		System.out.println(getEvenDigit(num));
		System.out.println(getEvenDigit(nums));
		System.out.println(test(nums));

	}

	public static int getEvenDigit(int[] num) {
		if (num == null || num.length == 0) {
			return -1;
		}

		int count = 0;
		for (int index = 0; index < num.length; index++) {
			if (isEven(num[index])) {
				count++;
			}

		}
		return count;

	}

	public static boolean isEven(int num) {

	//	int numberOfDigits = countDigits(num);

//		if(numberOfDigits%2==0) {
//			return true;
//		}
//		return false;

		return countDigits(num) % 2 == 0;

	}

	public static int countDigits(int num) {
		if (num == 0) {
			return 1;
		}

		num = Math.abs(num);

		int count = 0;

		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;

	}

	public static int test(int[] arr) {

		int noOfDigits = 0;

		for (int num : arr) {

			int count = 0;

			if (num == 0) {
				count =  1;
			}

			//num = Math.abs(num);
			
			if(num<0) {
				num = num*-1;
			}
			
			while (num > 0) {
				num = num / 10;
				count++;
			}
			if (count % 2 == 0) {
				noOfDigits++;
			}
		}
		return noOfDigits;

	}

}
