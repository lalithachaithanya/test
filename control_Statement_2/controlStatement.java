package control_Statement_2;

public class controlStatement {

	public static String checkNumber(int num) {

		if (num > 0) {
			return "Positive";
		} else if (num < 0) {
			return "Negative";
		} else {
			return "Zero";
		}
	}

	public static String analyzeNumber(int num) {

		if (num == 0) {
			return "Zero"; // Return immediately if number is zero
		}
		return num > 0 ? "Positive" : "Negative";
	}

	public static void main(String[] args) {
		
		System.out.println("\n 5 is " + checkNumber(5));
		System.out.println("\n-3 is " + checkNumber(-3));
		System.out.println("\n 0 is " + checkNumber(0));

		/*
		 * System.out.println("If statement"); // TODO Auto-generated method stub int
		 * number1 = 10, number2 = -10, number3 = 0;
		 * 
		 * if (number1 > 0) { System.out.println(number1 + " its postive number"); }
		 * 
		 * System.out.println("If else ststement"); if (number2 > 0) {
		 * System.out.println(number2 + " its positive number"); } else {
		 * System.out.println(number2 + " its negative number"); }
		 * 
		 * 
		 * System.out.println("\nNusted if else"); if (number3 >= 0) { if (number1 == 0)
		 * { System.out.println("its zero"); } else {
		 * System.out.println("its positive number"); } } else {
		 * System.out.println("its negative number"); }
		 */

		// SwitchCase
		System.out.println("\nSwitch Case : Print the day of the week based on a number/n");
		int day = 3;
		String dayName;
		switch (day) {
		case 1:
			dayName = "monday";
			break;
		case 2:
			dayName = "monday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thuresday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		default:
			dayName = "invalideName";

		}
		System.out.println("\n  The day name is " + dayName);

		// whileLoop
		System.out.println("\nWhile Loop : Print numbers from 1 to 5 using a while loop");
		int c = 1;
		while (c <= 5) {
			System.out.println("\n  " + c);
			c++;
		}

		// doWhile Loop
		System.out.println("\ndo While Loop : Print numbers from 1 to 5 using a do while loop");
		int d = 0;
		do {
			d++;
			System.out.println("\n " + d);

		} while (d < 5);

		// For loop
		System.out.println("\nFor Loop : Print numbers from 1 to 5 using a for loop");
		for (int i = 1; i <= 5; i++) {
			System.out.println("\n " + i);
		}
// enanched for loop
		System.out.println("\nEnhanced for Loop : Demonstrating Enanched loop");

		String[] car = { " xuv ", " audi ", " bmw " };
		for (String i : car)
			System.out.println("\n " + i);

// jumping statements BREAK

		System.out.println("\nNumbers from 1 to 10 (stopping at 5):");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break; // Exit the loop when i is 5
			}
			System.out.print("\n " + i + " ");
		}

// jumping statement CONTINUE

		System.out.println("\nNumbers from 1 to 10 (skipping 5): continue ");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue; // Skip the rest of the loop for i=5
			}
			System.out.print("\n " + i + " ");
		}

//jumping statement return
		
		System.out.println("\nAll Jumping Statement : break, continue, and return:");

		// Break demonstration
		System.out.println("\nBreak example (stop at 5):");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print("\n " + i + " ");
		}

		// Continue demonstration
		System.out.println("\nContinue example (skip odd numbers):");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print("\n " + i + " ");
		}

		// Return demonstration
		System.out.println("\nReturn examples:");
		System.out.println("\n 7 is " + analyzeNumber(7));
		System.out.println("\n -4 is " + analyzeNumber(-4));
		System.out.println("\n 0 is " + analyzeNumber(0));
	}

}
