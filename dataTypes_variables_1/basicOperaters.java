package dataTypes_variables_1;

public class basicOperaters {
	
public static void main(String[] args) {
	        System.out.println("1. Arithmetic Operations");
	        // 1. Arithmetic Operations
	        int num1 = 20, num2 = 8;
	        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	        
	        System.out.println("2. Modulus Operation");
	        // 2. Modulus Operation
	        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
	        
	        System.out.println("3. Increment/Decrement");
	        // 3. Increment/Decrement
	        int counter = 5;
	        System.out.println("Original value: " + counter);
	        System.out.println("Post-increment: " + counter++);
	        System.out.println("After increment: " + counter);
	        System.out.println("Pre-increment: " + ++counter);
	        System.out.println("Post-decrement: " + counter--);
	        System.out.println("After decrement: " + counter);
	        
	        System.out.println(" 4. Circle Circumference");
	        // 4. Circle Circumference
	        double radius = 7.0;
	        double circumference = 2 * Math.PI * radius;
	        System.out.println("Circumference (radius=" + radius + "): " + circumference);
	        
	        System.out.println("5. Quadratic Equation Roots");
	        // 5. Quadratic Equation Roots
	        double a = 1, b = -5, c = 6; // Equation: x² -5x +6 = 0
	        double discriminant = b*b - 4*a*c;
	        double root1 = (-b + Math.sqrt(discriminant)) / (2*a);
	        double root2 = (-b - Math.sqrt(discriminant)) / (2*a);
	        System.out.println("Roots of " + a + "x² + " + b + "x + " + c + ": " + root1 + ", " + root2);
	        
	        System.out.println("6. Average of Three Numbers");
	        // 6. Average of Three Numbers
	        int n1 = 10, n2 = 20, n3 = 30;
	        double average = (n1 + n2 + n3) / 3.0;
	        System.out.println("Average of " + n1 + ", " + n2 + ", " + n3 + ": " + average);
	        
	        System.out.println("7. Convert Meters to Kilometers");
	        // 7. Convert Meters to Kilometers
	        double meters = 2500;
	        double kilometers = meters / 1000;
	        System.out.println(meters + " meters = " + kilometers + " kilometers");
	        
	        System.out.println("8. Currency Converter (USD to INR)");
	        // 8. Currency Converter
	        double usd = 50;
	        double exchangeRate = 83.5; // 1 USD = 83.5 INR
	        double inr = usd * exchangeRate;
	        System.out.println("$" + usd + " = ₹" + inr); 
	        System.out.println("9. Tip Calculator");
	        // 9. Tip Calculator
	        double billAmount = 1200;
	        double tipPercent = 15; // 15%
	        double tipAmount = billAmount * (tipPercent / 100);
	        System.out.println("Tip (" + tipPercent + "% of " + billAmount + "): " + tipAmount);
	        
	        System.out.println("10. Total Cost with Sales Tax");
	        // 10. Total Cost Calculation
	        double itemPrice = 999;
	        double taxRate = 8.25; // 8.25%
	        double taxAmount = itemPrice * (taxRate / 100);
	        double totalCost = itemPrice + taxAmount;
	        System.out.println("Item price: " + itemPrice);
	        System.out.println("Tax (" + taxRate + "%): " + taxAmount);
	        System.out.println("Total cost: " + totalCost);
	    }
	}