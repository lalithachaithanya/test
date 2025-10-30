package polymorphism_10;

public class SumCalculator {
	
	    // Two integers
	    public static int calculateSum(int a, int b) {
	        return a + b;
	    }
	    
	    // Three integers
	    public static int calculateSum(int a, int b, int c) {
	        return a + b + c;
	    }
	    
	    // Two doubles
	    public static double calculateSum(double a, double b) {
	        return a + b;
	    }
	    
	    // Integer and double
	    public static double calculateSum(int a, double b) {
	        return a + b;
	    }
	    
	    // Array of integers
	    public static int calculateSum(int[] numbers) {
	        int sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }
	        return sum;
	    }
	    
	    public static void main(String[] args) {
	        System.out.println("Sum of 2 and 3: " + calculateSum(2, 3));
	        System.out.println("Sum of 2, 3 and 4: " + calculateSum(2, 3, 4));
	        System.out.println("Sum of 2.5 and 3.5: " + calculateSum(2.5, 3.5));
	        System.out.println("Sum of 2 and 3.5: " + calculateSum(2, 3.5));
	        
	        int[] nums = {1, 2, 3, 4, 5};
	        System.out.println("Sum of array: " + calculateSum(nums));
	    }
	
}
