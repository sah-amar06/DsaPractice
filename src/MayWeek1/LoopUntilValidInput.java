package MayWeek1;

import java.util.Scanner;

public class LoopUntilValidInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age;

		while (true) {
			System.out.println("Please enter your age: ");

			if (sc.hasNextInt()) {
				age = sc.nextInt();
				System.out.println(VoteEligibilityCheck.eligibilityCheck(age));
				break;
			} else {
				System.out.println("Invalid input, please try again");
				sc.next(); // clear invalid input
			}
		}

		System.out.println("Valid age " + age);

		// System.out.println(VoteEligibilityCheck.eligibilityCheck(age));
		sc.close();

	}

}
