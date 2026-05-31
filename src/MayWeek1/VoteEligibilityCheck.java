package MayWeek1;

import java.util.Scanner;

public class VoteEligibilityCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		
		if(sc.hasNextInt()) {
			int age = sc.nextInt();

			System.out.println(eligibilityCheck(age));
		}else {
			System.out.println("Invalid input, please enter a number");
		}
		
		sc.close();

	}

	/*
	 * Take the age from user and decide accordingly
	 * 
	 * 1. If age<18 :- Not eligible for vote 
	 * 2. If age>=18 :- Eligible for vote
	 */

	public static String eligibilityCheck(int age) {

		if (age <= 0) {
			return "Please enter the correct age";
		} else if (age < 18) {
			return "Not eligible for vote";
		} else {
			return "Eligible for vote";
		}
	}

}
