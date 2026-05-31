package MayWeek1;

import java.util.Scanner;

public class AdultCheck {

	/**
	 * Write a program to check the person is adult or not based on the age
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean running = true;

		while (running) {

			System.out.println("Enter your age: ");

			if (sc.hasNextInt()) {
				int age = sc.nextInt();

				// System.out.println(ageCheck(age));

				if (age <= 0) {
					System.out.println("Please enter the correct age: ");

				} else if (age < 18) {
					System.out.println("Not an adult");
				} else {
					System.out.println("Adult");
				}

				System.out.println("Do you want to continue? (yes/no)");
				String choice = sc.next();

				if (choice.equalsIgnoreCase("no")) {
					System.out.println("Program terminated");
					running = false;
				} else {
					System.out.println("Please enter the valid age: ");
					sc.next();
				}
			}
			else{
				System.out.println("Please enter valid numeric age");
				sc.next();
			}
		}
		sc.close();
	}

	public static String ageCheck(int age) {

		if (age < 0)
			return "Invalid age: " + age;
		return age < 18 ? "Not an Adult: " + age : "Adult: ";

	}
}
