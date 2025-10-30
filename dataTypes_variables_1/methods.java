package dataTypes_variables_1;

public class methods {
	
	    // 1. Greeting Method
	    public static void greet(String name) {
	        System.out.println("Hello, " + name + "! Welcome to Java programming!");
	    }

	    // 2. Sum Method
	    public static int sum(int a, int b) {
	        return a + b;
	    }

	    // 3. Max Method
	    public static int max(int a, int b) {
	        return (a > b) ? a : b;
	    }

	    // 4. Palindrome Checker
	    public static boolean isPalindrome(int number) {
	        int original = number;
	        int reversed = 0;
	        
	        while (number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number /= 10;
	        }
	        
	        return original == reversed;
	    }

	    // 5. Factorial Method
	    public static long factorial(int n) {
	        if (n < 0) return -1; // Error case for negative numbers
	        long result = 1;
	        for (int i = 2; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }

	    // 6. Circle Area Method
	    public static double circleArea(double radius) {
	        return Math.PI * radius * radius;
	    }

	    // 7. Even or Odd Method
	    public static String evenOrOdd(int number) {
	        return (number % 2 == 0) ? "Even" : "Odd";
	    }

	    // 8. Prime Method
	    public static boolean isPrime(int number) {
	        if (number <= 1) return false;
	        if (number == 2) return true;
	        if (number % 2 == 0) return false;
	        
	        for (int i = 3; i <= Math.sqrt(number); i += 2) {
	            if (number % i == 0) return false;
	        }
	        return true;
	    }

	    // 9. Swap Method
	    public static void swap(int[] numbers) {
	        if (numbers.length != 2) return;
	        int temp = numbers[0];
	        numbers[0] = numbers[1];
	        numbers[1] = temp;
	    }

	    // 10. Reverse String Method
	    public static String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString();
	    }

	    public static void main(String[] args) {
	        // Test all methods
	        System.out.println("1. Greeting Method:");
	        greet("Alice");

	        System.out.println("\n2. Sum Method:");
	        System.out.println("Sum of 5 and 7: " + sum(5, 7));

	        System.out.println("\n3. Max Method:");
	        System.out.println("Max between 12 and 8: " + max(12, 8));

	        System.out.println("\n4. Palindrome Checker:");
	        System.out.println("Is 12321 a palindrome? " + isPalindrome(12321));
	        System.out.println("Is 12345 a palindrome? " + isPalindrome(12345));

	        System.out.println("\n5. Factorial Method:");
	        System.out.println("Factorial of 5: " + factorial(5));

	        System.out.println("\n6. Circle Area Method:");
	        System.out.println("Area of circle with radius 3.5: " + circleArea(3.5));

	        System.out.println("\n7. Even or Odd Method:");
	        System.out.println("15 is " + evenOrOdd(15));

	        System.out.println("\n8. Prime Method:");
	        System.out.println("Is 17 prime? " + isPrime(17));
	        System.out.println("Is 15 prime? " + isPrime(15));

	        System.out.println("\n9. Swap Method:");
	        int[] nums = {10, 20};
	        System.out.println("Before swap: " + nums[0] + ", " + nums[1]);
	        swap(nums);
	        System.out.println("After swap: " + nums[0] + ", " + nums[1]);

	        System.out.println("\n10. Reverse String Method:");
	        System.out.println("Reverse of 'hello': " + reverseString("hello"));
	    }
	}
