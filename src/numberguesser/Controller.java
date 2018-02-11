package numberguesser;

import java.util.Scanner;

public class Controller {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Think of a Number from 1-100");
		int top = 100;
		int bot = 1;
		int mid = 0;
		boolean isCorrectNumber = false;
		do {
			// Calculates the middle point
			mid = (top + bot) / 2;
			System.out.println(mid);
			// Asks the user if the chosen number is correct
			System.out.println("Is this your chosen number? (Y/N)");
			String input = scan.next().toUpperCase();
			// A flag is triggered if the number is correct
			if (input.equals("Y") || input.equals("YES")) {
				isCorrectNumber = true;
			} else {
				// The user is asked if their number is higher or lower
				System.out.println("Is your number higher or lower?");
				input = scan.next().toUpperCase();
				if (input.equals("HIGHER")) {
					// If higher, the bottom is raised
					bot = mid + 1;
				} else {
					// If lower, the top is lowered
					top = mid - 1;
				}
			}
		} while (isCorrectNumber == false && bot <= top);
		if (isCorrectNumber == true) {
			// Displays message if number was found
			System.out.println("Your number (" + mid + ") was found!");
		} else {
			// Displays error message is number was not found
			System.out.println("Only whole numbers from 1-100 are accepted.");
		}
	}
}
