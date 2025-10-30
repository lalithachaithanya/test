package dataTypes_variables_1;

import java.util.Scanner;

public class controlStatements {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("=== 1. Even or Odd Checker ===");
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        if(num % 2 == 0) {
	            System.out.println(num + " is even");
	        } else {
	            System.out.println(num + " is odd");
	        }
	        
	        System.out.println("\n=== 2. Positive or Negative Checker ===");
	        System.out.print("Enter a number: ");
	        num = scanner.nextInt();
	        if(num > 0) {
	            System.out.println(num + " is positive");
	        } else if(num < 0) {
	            System.out.println(num + " is negative");
	        } else {
	            System.out.println("The number is zero");
	        }
	        
	        System.out.println("\n=== 3. Largest of Three Numbers ===");
	        System.out.print("Enter three numbers separated by spaces: ");
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int c = scanner.nextInt();
	        int largest = a;
	        if(b > largest) largest = b;
	        if(c > largest) largest = c;
	        System.out.println("Largest number is: " + largest);
	        
	        System.out.println("\n=== 4. Leap Year Checker ===");
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();
	        if((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
	            System.out.println(year + " is a leap year");
	        } else {
	            System.out.println(year + " is not a leap year");
	        }
	        
	        System.out.println("\n=== 5. Grade Calculator ===");
	        System.out.print("Enter student's marks (0-100): ");
	        int marks = scanner.nextInt();
	        char grade;
	        if(marks >= 90) grade = 'A';
	        else if(marks >= 80) grade = 'B';
	        else if(marks >= 70) grade = 'C';
	        else if(marks >= 60) grade = 'D';
	        else grade = 'F';
	        System.out.println("Grade: " + grade);
	        
	        System.out.println("\n=== 6. Sum of Natural Numbers ===");
	        System.out.print("Enter a number (n): ");
	        int n = scanner.nextInt();
	        int sum = 0;
	        for(int i = 1; i <= n; i++) {
	            sum += i;
	        }
	        System.out.println("Sum of first " + n + " natural numbers: " + sum);
	        
	        System.out.println("\n=== 7. Factorial Calculator ===");
	        System.out.print("Enter a number: ");
	        n = scanner.nextInt();
	        long factorial = 1;
	        for(int i = 1; i <= n; i++) {
	            factorial *= i;
	        }
	        System.out.println(n + "! = " + factorial);
	        
	        System.out.println("\n=== 8. Multiplication Table ===");
	        System.out.print("Enter a number: ");
	        n = scanner.nextInt();
	        System.out.println("Multiplication table for " + n + ":");
	        for(int i = 1; i <= 10; i++) {
	            System.out.println(n + " x " + i + " = " + (n * i));
	        }
	        
	        System.out.println("\n=== 9. Fibonacci Series ===");
	        System.out.print("Enter how many terms you want: ");
	        n = scanner.nextInt();
	        System.out.println("Fibonacci series:");
	        int first = 0, second = 1;
	        for(int i = 1; i <= n; i++) {
	            System.out.print(first + " ");
	            int next = first + second;
	            first = second;
	            second = next;
	        }
	        System.out.println();
	        
	        System.out.println("\n=== 10. Prime Number Checker ===");
	        System.out.print("Enter a number: ");
	        n = scanner.nextInt();
	        boolean isPrime = true;
	        if(n <= 1) {
	            isPrime = false;
	        } else {
	            for(int i = 2; i <= Math.sqrt(n); i++) {
	                if(n % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        System.out.println(n + (isPrime ? " is prime" : " is not prime"));
	        
	        scanner.close();
	    }
	}