package MayWeek1;

import java.util.Scanner;

public class GetDaysOfWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		while (true) {
			System.out.println("Please enter the number: ");
			if (sc.hasNextInt()) {
				num = sc.nextInt();

				if (num >= 1 && num <= 7) {
					System.out.println(getWeekDays(num));
					getWeekDays(10);
					break; // Only break when valid
				} else {
					System.out.println("Number must be between 1 and 7");
				}

			} else {
				System.out.println("Invalid entry, please enter a number");
				sc.next(); // Clear invalid input
			}

		}
		sc.close();
	}

	public static String getWeekDays(int num) {

		switch (num) {

		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		case 7:
			return "Sunday";
		default:
			throw new IllegalArgumentException("Invalid day number");
			
			/**
			 * 
			 * Que: Why use default exception if already validated?
			 * Even though input is validated earlier,
			 * we still add a default case to make the method self-defensive. 
			 * This ensures it fails fast if used incorrectly elsewhere 
			 * and improves reliability, debugging, and testability.
			 */

		}
	}

}
