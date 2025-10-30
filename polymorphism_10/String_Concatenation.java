package polymorphism_10;

public class String_Concatenation {
	
	    // Two strings
	    public static String concatenate(String str1, String str2) {
	        return str1 + str2;
	    }
	    
	    // String and integer
	    public static String concatenate(String str, int num) {
	        return str + num;
	    }
	    
	    // String and double
	    public static String concatenate(String str, double num) {
	        return str + num;
	    }
	    
	    // String, integer and double
	    public static String concatenate(String str, int num1, double num2) {
	        return str + num1 + num2;
	    }
	    
	    public static void main(String[] args) {
	        System.out.println(concatenate("Hello ", "World"));
	        System.out.println(concatenate("Number: ", 42));
	        System.out.println(concatenate("Value: ", 3.14));
	        System.out.println(concatenate("Numbers: ", 10, 2.5));
	    }
	}
