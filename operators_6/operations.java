package operators_6;

public class operations {

	public static void main(String[] args) {
		int a = 15;
		int b = 4;

		int c = 10;
		int d = 20;

		System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
		System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
		System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
		System.out.println("Division: " + a + " / " + b + " = " + (a / b));
		System.out.println("Modulus: " + a + " % " + b + " = " + (a % b));

		System.out.println("Equal to (==): " + (c == d));
		System.out.println("Not equal to (!=): " + (c != d));
		System.out.println("Greater than (>): " + (c > d));
		System.out.println("Less than (<): " + (c < d));
		System.out.println("Greater than or equal to (>=): " + (c >= d));
		System.out.println("Less than or equal to (<=): " + (c <= d));

		int age = 17;
		boolean hasParentalConsent = true;
		boolean isWeekend = true;

		// Using logical AND
		boolean canWatchMovie = age >= 18 || (age >= 13 && hasParentalConsent);
		System.out.println("Can watch the movie: " + canWatchMovie);

		// Using logical OR
		boolean canPlayOutside = isWeekend || !isWeekend && age < 12;
		System.out.println("Can play outside: " + canPlayOutside);

		// Using logical NOT
		boolean cannotEnter = !(age >= 21);
		System.out.println("Cannot enter the club: " + cannotEnter);

		// Complex combination
		boolean specialAccess = (age >= 16 && hasParentalConsent) || isWeekend;
		System.out.println("Has special access: " + specialAccess);

		// 1. Minimum of three numbers
		int x = 15, y = 10, z = 20;
		int min = (x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z);
		System.out.println("Min of " + x + "," + y + "," + z + ": " + min);

		// 2. Even or odd
		int num = 42;
		System.out.println(num + " is " + (num % 2 == 0 ? "even" : "odd"));

		// 3. Grade assignment
		int score = 78;
		char grade = score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : score >= 60 ? 'D' : 'F';
		System.out.println("Score " + score + " = Grade " + grade);

		// 4. Positive or negative
		int value = -3;
		System.out.println(value + " is " + (value >= 0 ? "positive" : "negative"));

		// 5. Absolute value
		int n = -15;
		System.out.println("Absolute value of " + n + " is " + (n < 0 ? -n : n));

		// 6. Leap year
		int year = 2000;
		boolean leap = year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
		System.out.println(year + " is " + (leap ? "" : "not ") + "a leap year");
	}

}
