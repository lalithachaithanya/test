package switch_break_4;

import java.util.Scanner;

public class switch_case {

	private static void main(String[] args) {

		System.out.println("1. Addition(+) ");
		System.out.println("2. Subraction(-) ");
		System.out.println("3. Multiplication(*) ");
		System.out.println("4. Division(/) ");
		Scanner getValue = new Scanner(System.in);

		System.out.print("enter the first number : ");
		double number = getValue.nextDouble();
		System.out.print("enter the second number : ");
		double number1 = getValue.nextDouble();
		System.out.print("choose the operation (+ , - , * , /): ");
		char operator = getValue.next().charAt(0);

		double result = 0;

		switch (operator) {

		case '+':
			result = number + number1;
			System.out.println("result : " + number + "+" + number1 + " = " + result + " ");
			break;

		case '-':
			result = number - number1;
			System.out.println("result : " + number + "-" + number1 + " = " + result + " ");
			break;

		case '*':
			result = number * number1;
			System.out.println("result : " + number + "*" + number1 + " = " + result + " ");
			break;

		case '/':
			result = number / number1;
			System.out.println("result : " + number + "/" + number1 + " = " + result + " ");
			break;
		default:
			System.out.println("invalide");
		}
		// getValue.close();

		System.out.println("\nGread system");

		Scanner grade = new Scanner(System.in);
		System.out.println("Enter your mark  to know your percentage : ");

		double percentage = grade.nextDouble();

		if (percentage < 0 || percentage > 100) {

			System.out.println("its  invalide percentage  enter the valide percentage ");
			return;
		}

		String gradeM;
		int range = (int) percentage / 10;
		switch (range) {
		case 10:
		case 9:
			gradeM = "A (Excellent)";
			break;
		case 8:
			gradeM = "B (Very Good)";
			break;
		case 7:
			gradeM = "C (Good)";
			break;
		case 6:
			gradeM = "D (Satisfactory)";
			break;
		case 5:
			gradeM = "E (Pass)";
			break;
		default:
			gradeM = "F (Fail)";
			break;

		}

		System.out.printf("With %.1f%%, your grade is: %s%n", percentage, grade);

		// grade.close();

		System.out.println("\nStreet LIght system");

		Scanner StreetLight = new Scanner(System.in);

		System.out.println("Light Status Options:");
		System.out.println("1. Red");
		System.out.println("2. Yellow");
		System.out.println("3. Green");
		System.out.println("4. Off");

		System.out.print("Enter current light status (1-4): ");
		int status = StreetLight.nextInt();

		switch (status) {
		case 1:
			System.out.println("Red light");
			break;
		case 2:
			System.out.println("Yed light");
			break;
		case 3:
			System.out.println("Green light");
			break;
		case 4:
			System.out.println("Off light");
			break;
		default:
			System.out.println("invalide light");
		}
			//StreetLight.close()
		
		

		System.out.println("\nTo dispaly the month responding to integer");

		Scanner displayMonth = new Scanner(System.in);
		System.out.println("Enter a number from one to twelve in order to display the month ");
		int month = displayMonth.nextInt();

		if (month > 12) {
			System.out.println("Enter the valid number");
			return;
		}
		switch (month) {

		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("Febuary");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("invalide month");
		}
		//displayMonth.close()

		Scanner Driven_menu = new Scanner(System.in);

		int get;
		do {
			System.out.println("1. Addition(+) ");
			System.out.println("2. Subraction(-) ");
			System.out.println("3. Multiplication(*) ");
			System.out.println("4. Division(/) ");
			System.out.print("Enter your choice (1-5): ");
			get = Driven_menu.nextInt();

			// The switch-case needs to check for integer values, not characters.
			switch (get) {
			case 1:
				System.out.println("Enter the first number");
				int getNumber1 = Driven_menu.nextInt();
				System.out.println("Enter your second number");
				int getNumber2 = Driven_menu.nextInt();
				int Driven_menuResultAdd = getNumber1 + getNumber2;
				System.out.println("The addition of " + getNumber1 + " + " + getNumber2 + " = " + Driven_menuResultAdd);
				break;
			case 2:
				System.out.println("Enter the first number");
				int getNumber3 = Driven_menu.nextInt();
				System.out.println("Enter your second number");
				int getNumber4 = Driven_menu.nextInt();
				int Driven_menuResultSub = getNumber3 - getNumber4; // Corrected to subtraction
				System.out.println(
						"The subtraction of " + getNumber3 + " - " + getNumber4 + " = " + Driven_menuResultSub);
				break;
			case 3:
				System.out.println("Enter the first number");
				int getNumber5 = Driven_menu.nextInt();
				System.out.println("Enter your second number");
				int getNumber6 = Driven_menu.nextInt();
				int Driven_menuResultMulti = getNumber5 * getNumber6; // Corrected to multiplication
				System.out.println(
						"The multiplication of " + getNumber5 + " * " + getNumber6 + " = " + Driven_menuResultMulti);
				break;
			case 4:
				System.out.println("Enter the first number");
				int getNumber7 = Driven_menu.nextInt();
				System.out.println("Enter your second number");
				int getNumber8 = Driven_menu.nextInt();
				// Prevent division by zero
				if (getNumber8 != 0) {
					double Driven_menuResultDivid = (double) getNumber7 / getNumber8; // Use double for accurate
																						// division
					System.out.println(
							"The division of " + getNumber7 + " / " + getNumber8 + " = " + Driven_menuResultDivid);
				} else {
					System.out.println("Error: Cannot divide by zero.");
				}
				break;
			case 5:
				System.out.println("Exiting the calculator. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 5.");
				break;
			}
			System.out.println(); // Add a new line for better readability between turns
		} while (get != 5);

		//Driven_menu.close(); 

		Scanner Convert_Month_To_Days = new Scanner(System.in);

		System.out.print("Enter month number (1-12): ");
		int months = Convert_Month_To_Days.nextInt();

		String days;

		switch (months) {
		case 1:

		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("january , March , may , july, August, October , December");
			days = "31 days";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Febuary , April , jun , September , Novamber");
			days = "30 days";
			break;
		case 2:
			days = "28 days (not a leap year)";
			break;
		default:
			days = "Invalid month!";
		}

		System.out.println(days);
	//	Convert_Month_To_Days.close();

		Scanner pointGrade = new Scanner(System.in);

		System.out.println("Grade Point Calculator");
		System.out.println("---------------------");
		System.out.print("Enter letter grade (A, B, C, D, F): ");
		char gradeRange = pointGrade.next().toUpperCase().charAt(0);

		double gradePoint;

		switch (gradeRange) {
		case 'A':
			gradePoint = 4.0;
			break;
		case 'B':
			gradePoint = 3.0;
			break;
		case 'C':
			gradePoint = 2.0;
			break;
		case 'D':
			gradePoint = 1.0;
			break;
		case 'F':
			gradePoint = 0.0;
			break;
		default:
			System.out.println("Invalid grade entered!");
			return;
		}

		System.out.println("Grade point for " + grade + " is: " + gradePoint);
		//pointGrade.close();

		Scanner Vending = new Scanner(System.in);

		System.out.println("Simple Vending Machine");
		System.out.println("---------------------");
		System.out.println("1. Chips ($1.50)");
		System.out.println("2. Soda ($1.25)");
		System.out.println("3. Candy ($0.75)");
		System.out.print("Select your product (1-3): ");

		int choice = Vending.nextInt();
		String product;

		switch (choice) {
		case 1:
			product = "Chips";
			break;
		case 2:
			product = "Soda";
			break;
		case 3:
			product = "Candy";
			break;
		default:
			System.out.println("Invalid selection!");
			return;
		}

		System.out.println("Dispensing: " + product);
		System.out.println("Thank you for your purchase!");
		Vending.close();

		// public class ActivityPlanner {
		// public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Daily Activity Planner");
		System.out.println("---------------------");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");
		System.out.print("Enter day number (1-7): ");

		int day = scanner.nextInt();
		String activity;

		switch (day) {
		case 1:
			activity = "Work day - Team meeting at 10 AM";
			break;
		case 2:
			activity = "Work day - Gym session after work";
			break;
		case 3:
			activity = "Work day - Midweek lunch with colleagues";
			break;
		case 4:
			activity = "Work day - Online course in the evening";
			break;
		case 5:
			activity = "Work day - Happy hour with friends";
			break;
		case 6:
			activity = "Weekend - Hiking trip";
			break;
		case 7:
			activity = "Weekend - Relax and family time";
			break;
		default:
			System.out.println("Invalid day number!");
			return;
		}

		System.out.println("Suggested activity: " + activity);
		scanner.close();

	}

}
