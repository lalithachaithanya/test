package methods_7;

public class methods_all {

	public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
    }
	public static int sum(int a, int b) {
        return a + b;
    }
	 public static int findMax(int num1, int num2) {
	        return (num1 > num2) ? num1 : num2;
	    }
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
	 public static long factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        return n * factorial(n - 1);
	        }
	 public static double calculateArea(double radius) {
	        return Math.PI * radius * radius;
	    }
	 public static String checkEvenOdd(int number) {
	        return (number % 2 == 0) ? "Even" : "Odd";
	    }
	 public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }	
	 public static void swap(int[] numbers) {
	        if (numbers.length >= 2) {
	            int temp = numbers[0];
	            numbers[0] = numbers[1];
	            numbers[1] = temp;
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printGreeting("Alice");
		System.out.println("Sum: " + sum(5, 7));
		System.out.println("Max: " + findMax(10, 15));
		System.out.println("Is 121 palindrome? " + isPalindrome(121));
		System.out.println("Factorial of 5: " + factorial(5));
		System.out.println("Area: " + calculateArea(5.0));
		System.out.println("7 is " + checkEvenOdd(7));	
		System.out.println("Is 17 prime? " + isPrime(17));
		int[] nums = {5, 10};
        swap(nums);
        System.out.println("After swap: " + nums[0] + ", " + nums[1]);
		
		
	}

}
