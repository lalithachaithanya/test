package dataTypes_variables_1;

import java.util.Scanner;

public class bmiCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weightKg = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double heightM = input.nextDouble();

        double bmi = calculateBMI(weightKg, heightM);
        String category = classifyBMI(bmi);

        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Your BMI category is: " + category);

        input.close();
    }

    public static double calculateBMI(double weight, double height) {
        if (height <= 0) {
            System.err.println("Height cannot be zero or negative.");
            return 0; // Or throw an exception
        }
        return weight / (height * height);
    }
    
    public static String classifyBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
	}

}
