package dataTypes_variables_1;

public class dataTypes_variables {

	    public static void main(String[] args) {
	        System.out.println("=== 1. Variable Declaration ===");
	        // 1. Declare Variables
	        int myInt = 10;
	        double myDouble = 3.14;
	        char myChar = 'A';
	        boolean myBoolean = true;
	        System.out.println("Integer: " + myInt);
	        System.out.println("Double: " + myDouble);
	        System.out.println("Char: " + myChar);
	        System.out.println("Boolean: " + myBoolean);
	        
	        System.out.println("\n=== 2. Swap Two Numbers ===");
	        // 2. Swap Two Numbers
	        int a = 5, b = 10;
	        System.out.println("Before swap: a = " + a + ", b = " + b);
	        int temp = a;
	        a = b;
	        b = temp;
	        System.out.println("After swap: a = " + a + ", b = " + b);
	        
	        System.out.println("\n=== 3. Circle Area ===");
	        // 3. Circle Area
	        double radius = 5.0;
	        double circleArea = Math.PI * radius * radius;
	        System.out.println("Area of circle (radius=" + radius + "): " + circleArea);
	        
	        System.out.println("\n=== 4. Simple Interest ===");
	        // 4. Simple Interest
	        double principal = 1000, rate = 5, time = 2;
	        double interest = (principal * rate * time) / 100;
	        System.out.println("Simple Interest (P=" + principal + ", R=" + rate + 
	                          "%, T=" + time + "yrs): " + interest);
	        
	        System.out.println("\n=== 5. Temperature Conversion ===");
	        // 5. Temperature Conversion
	        double celsius = 25;
	        double fahrenheit = (celsius * 9/5) + 32;
	        System.out.println(celsius + "°C = " + fahrenheit + "°F");
	        
	        System.out.println("\n=== 6. Sum of Two Numbers ===");
	        // 6. Sum of Two Numbers
	        int num1 = 15, num2 = 25;
	        int sum = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + sum);
	        
	        System.out.println("\n=== 7. Product of Two Numbers ===");
	        // 7. Product of Two Numbers
	        double x = 2.5, y = 3.5;
	        double product = x * y;
	        System.out.println(x + " * " + y + " = " + product);
	        
	        System.out.println("\n=== 8. Rectangle Area ===");
	        // 8. Rectangle Area
	        double length = 10, width = 5;
	        double rectangleArea = length * width;
	        System.out.println("Area of rectangle (" + length + "x" + width + "): " + rectangleArea);
	        
	        System.out.println("\n=== 9. Square Perimeter ===");
	        // 9. Square Perimeter
	        double side = 7;
	        double perimeter = 4 * side;
	        System.out.println("Perimeter of square (side=" + side + "): " + perimeter);
	        
	        System.out.println("\n=== 10. BMI Calculator ===");
	        // 10. BMI Calculator
	        double weight = 70, height = 1.75;
	        double bmi = weight / (height * height);
	        System.out.println("BMI (weight=" + weight + "kg, height=" + height + "m): " + bmi);
	    }
	
}	
