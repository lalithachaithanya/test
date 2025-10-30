package polymorphism_10;

public class Area_Calculation {

	public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Rectangle area
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    // Triangle area
    public static double calculateArea(double base, double height, String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        }
        return 0;
	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Circle area: " + calculateArea(5.0));
        System.out.println("Rectangle area: " + calculateArea(4.0, 6.0));
        System.out.println("Triangle area: " + calculateArea(3.0, 4.0, "triangle"));
    }

	

}
