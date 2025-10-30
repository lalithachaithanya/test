package if_else_forLoop_3;

import java.util.Scanner;

public class if_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// public class PositiveNegative {
		// public static void main(String[] args) {
		Scanner PositiveNegative = new Scanner(System.in);
		System.out.println("\n1.Check Positive or Negative");
		System.out.print("\n Enter a number: ");
		double num = PositiveNegative.nextDouble();

		if (num > 0) {
			System.out.println("\n  Positive number");
		} else if (num < 0) {
			System.out.println("\n  Negative number");
		} else {
			System.out.println("\n  Zero");
		}

		// public class OddEven {
		// public static void main(String[] args) {
		Scanner OddEven = new Scanner(System.in);
		
		System.out.println("\n2.Odd or Even Number");
		System.out.print("\n Enter a number even or odd number: ");
		int number = OddEven.nextInt();

		if (number % 2 == 0) {
			System.out.println("\n  Even number");
		} else {
			System.out.println("\n  Odd number");
		}

		// public class VowelConsonant {
		// public static void main(String[] args) {
		Scanner VowelConsonant = new Scanner(System.in);
		System.out.print("\n3.Enter a character to find Vowel or Consonant: ");
		System.out.println("\n Enter the chracter : ");
		char ch = VowelConsonant.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("\n  Vowel");
		} else {
			System.out.println("\n  Consonant");
		}

		// public class GradeAssignment {
		// public static void main(String[] args) {
		Scanner GradeAssignment = new Scanner(System.in);
		System.out.println("\n4.Grade Assignment");
		System.out.print("\n Enter your score to know your grade ");
		
		int score = GradeAssignment.nextInt();

		if (score >= 90) {
			System.out.println("Grade: A");
		} else if (score >= 80) {
			System.out.println("Grade: B");
		} else if (score >= 70) {
			System.out.println("Grade: C");
		} else if (score >= 60) {
			System.out.println("Grade: D");
		} else {
			System.out.println("Grade: F");
		}

		/*
		 * import java.util.Scanner;
		 * 
		 * public class VotingEligibility { public static void main(String[] args) {
		 */
		Scanner VotingEligibility = new Scanner(System.in);
		System.out.print("\n5.Enter your age to eligible for vote ");
		System.out.println("\n Enter your age : ");
		int age = VotingEligibility.nextInt();

		if (age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not eligible to vote");
		}

		/*
		 * import java.util.Scanner;
		 * 
		 * public class LargestOfTwo { public static void main(String[] args) {
		 */
		Scanner LargestOfTwo = new Scanner(System.in);
		System.out.println("");
		System.out.print("Enter first number: ");
		double num1 = LargestOfTwo.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = LargestOfTwo.nextDouble();

		if (num1 > num2) {
			System.out.println(num1 + " is larger");
		} else if (num2 > num1) {
			System.out.println(num2 + " is larger");
		} else {
			System.out.println("Both numbers are equal");
		}

		/*
		 * import java.util.Scanner;
		 * 
		 * public class LeapYear { public static void main(String[] args) {
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();

		if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

		/*
		 * import java.util.Scanner;
		 * 
		 * public class SumOfN { public static void main(String[] args) {
		 */
		Scanner SumOfN = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = SumOfN.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("Sum of first " + n + " natural numbers: " + sum);

		/*
		 * import java.util.Scanner;
		 * 
		 * public class ReverseString { public static void main(String[] args) {
		 */
		Scanner ReverseString = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = ReverseString.nextLine();
		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		System.out.println("Reversed string: " + reversed);

		/*
		 * import java.util.Scanner;
		 * 
		 * public class Factorial { public static void main(String[] args) {
		 */
		Scanner Factorial = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int fact = Factorial.nextInt();
		long factorial = 1;

		for (int i = 1; i <= fact; i++) {
			factorial *= i;
		}

		System.out.println("Factorial of " + fact + ": " + factorial);

		/*
		 * import java.util.Scanner;
		 * 
		 * public class MultiplicationTable { public static void main(String[] args) {
		 */
		Scanner MultiplicationTable = new Scanner(System.in);
		System.out.print("Multiplication Table: ");
		int table = MultiplicationTable.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(table + " x " + i + " = " + (table * i));
		}

		// public class ReverseNumbers {
		// public static void main(String[] args) {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		/*
		 * public class Fibonacci { public static void main(String[] args) {
		 */
		int n1 = 0, n2 = 1;
		System.out.println(n1);
		System.out.println(n2);

		for (int i = 2; i < 10; i++) {
			int next = n1 + n2;
			System.out.println(next);
			n1 = n2;
			n2 = next;
		}
		/*
		 * import java.util.Scanner;
		 * 
		 * public class PrimeCheck { public static void main(String[] args) {
		 */
		Scanner PrimeCheck = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int P_num = PrimeCheck.nextInt();
		boolean isPrime = true;

		if (P_num <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= P_num / 2; i++) {
				if (P_num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(P_num + " is a prime number");
		} else {
			System.out.println(P_num + " is not a prime number");
		}

		/*
		 * import java.util.Scanner;
		 * 
		 * public class PowerCalculation { public static void main(String[] args) {
		 */
		Scanner PowerCalculation = new Scanner(System.in);
		System.out.print("Enter base: ");
		int base = PowerCalculation.nextInt();
		System.out.print("Enter exponent: ");
		int exponent = PowerCalculation.nextInt();
		long result = 1;

		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}

		System.out.println(base + "^" + exponent + " = " + result);

		/*
		 * import java.util.Scanner;
		 * 
		 * public class PalindromeCheck { public static void main(String[] args) {
		 */
		Scanner PalindromeCheck = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String strng = PalindromeCheck.nextLine();
		boolean isPalindrome = true;

		for (int i = 0; i < strng.length() / 2; i++) {
			if (strng.charAt(i) != strng.charAt(strng.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}

		/*
		 * import java.util.Scanner;
		 * 
		 * public class LargestOfThree { public static void main(String[] args) {
		 */
		Scanner LargestOfThree = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double number1 = LargestOfThree.nextDouble();
		System.out.print("Enter second number: ");
		double number2 = LargestOfThree.nextDouble();
		System.out.print("Enter third number: ");
		double number3 = LargestOfThree.nextDouble();

		if (number1 >= number2 && number1 >= number3) {
			System.out.println(num1 + " is the largest");
		} else if (number2 >= num1 && num2 >= number3) {
			System.out.println(number2 + " is the largest");
		} else {
			System.out.println(number3 + " is the largest");
		}

		/*
		 * import java.util.Scanner;
		 * 
		 * public class DivisibleBy5 { public static void main(String[] args) {
		 */
		Scanner DivisibleBy5 = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int numberx = DivisibleBy5.nextInt();

		if (num % 5 == 0) {
			System.out.println(numberx + " is divisible by 5");
		} else {
			System.out.println(numberx + " is not divisible by 5");
		}

		/*
		 * import java.util.Scanner;
		 * 
		 * public class LoginSystem { public static void main(String[] args) {
		 */
		final String CORRECT_USERNAME = "admin";
		final String CORRECT_PASSWORD = "password123";

		Scanner LoginSystem = new Scanner(System.in);
		System.out.print("Enter username: ");
		String username = LoginSystem.nextLine();
		System.out.print("Enter password: ");
		String password = LoginSystem.nextLine();

		if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Invalid username or password");
		}
		//LoginSystem.close();

	}

}
