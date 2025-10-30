package dataTypes_variables_1;

public class advanceMethods {

	    // 1. Sum of Digits
	    public static int sumOfDigits(int number) {
	        int sum = 0;
	        number = Math.abs(number); // Handle negative numbers
	        while (number > 0) {
	            sum += number % 10;
	            number /= 10;
	        }
	        return sum;
	    }

	    // 2. Armstrong Number Checker
	    public static boolean isArmstrong(int number) {
	        int original = number;
	        int sum = 0;
	        int digits = String.valueOf(number).length();
	        
	        while (number > 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, digits);
	            number /= 10;
	        }
	        
	        return sum == original;
	    }

	    // 3. GCD Calculator (Euclidean algorithm)
	    public static int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    // 4. LCM Calculator
	    public static int lcm(int a, int b) {
	        return (a * b) / gcd(a, b);
	    }

	    // 5. Number to Words (supports 0-999)
	    public static String numberToWords(int number) {
	        if (number == 0) return "Zero";
	        
	        String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", 
	                         "Seventeen", "Eighteen", "Nineteen"};
	        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	        
	        StringBuilder words = new StringBuilder();
	        
	        if (number >= 100) {
	            words.append(units[number / 100]).append(" Hundred ");
	            number %= 100;
	        }
	        
	        if (number >= 20) {
	            words.append(tens[number / 10]).append(" ");
	            number %= 10;
	        } else if (number >= 10) {
	            words.append(teens[number - 10]).append(" ");
	            number = 0;
	        }
	        
	        if (number > 0) {
	            words.append(units[number]).append(" ");
	        }
	        
	        return words.toString().trim();
	    }

	    // 6. Vowel or Consonant
	    public static String vowelOrConsonant(char ch) {
	        ch = Character.toLowerCase(ch);
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            return "Vowel";
	        } else if (ch >= 'a' && ch <= 'z') {
	            return "Consonant";
	        }
	        return "Not a letter";
	    }

	    // 7. Palindrome String Checker
	    public static boolean isStringPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;
	        
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }

	    // 8. Sum of Array Elements
	    public static int arraySum(int[] arr) {
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        return sum;
	    }

	    // 9. Average of Array Elements
	    public static double arrayAverage(int[] arr) {
	        if (arr.length == 0) return 0;
	        return (double) arraySum(arr) / arr.length;
	    }

	    // 10. Search Element in Array
	    public static boolean searchInArray(int[] arr, int target) {
	        for (int num : arr) {
	            if (num == target) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        // Test all methods
	        System.out.println("1. Sum of digits of 12345: " + sumOfDigits(12345));
	        
	        System.out.println("\n2. Is 153 an Armstrong number? " + isArmstrong(153));
	        System.out.println("   Is 123 an Armstrong number? " + isArmstrong(123));
	        
	        System.out.println("\n3. GCD of 54 and 24: " + gcd(54, 24));
	        
	        System.out.println("\n4. LCM of 12 and 18: " + lcm(12, 18));
	        
	        System.out.println("\n5. 456 in words: " + numberToWords(456));
	        
	        System.out.println("\n6. 'A' is a: " + vowelOrConsonant('A'));
	        System.out.println("   'B' is a: " + vowelOrConsonant('B'));
	        
	        System.out.println("\n7. Is 'madam' a palindrome? " + isStringPalindrome("madam"));
	        System.out.println("   Is 'hello' a palindrome? " + isStringPalindrome("hello"));
	        
	        int[] numbers = {1, 2, 3, 4, 5};
	        System.out.println("\n8. Sum of array [1,2,3,4,5]: " + arraySum(numbers));
	        
	        System.out.println("\n9. Average of array [1,2,3,4,5]: " + arrayAverage(numbers));
	        
	        System.out.println("\n10. Is 3 in the array? " + searchInArray(numbers, 3));
	        System.out.println("    Is 7 in the array? " + searchInArray(numbers, 7));
	    }
	}