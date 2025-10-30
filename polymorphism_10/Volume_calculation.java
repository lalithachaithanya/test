package polymorphism_10;

public class Volume_calculation {

	    // Cube volume
	    public static double calculateVolume(double side) {
	        return side * side * side;
	    }
	    
	    // Rectangular prism volume
	    public static double calculateVolume(double length, double width, double height) {
	        return length * width * height;
	    }
	    
	    // Sphere volume
	    public static double calculateVolume(double radius, String shape) {
	        if (shape.equalsIgnoreCase("sphere")) {
	            return (4.0/3.0) * Math.PI * radius * radius * radius;
	        }
	        return 0;
	    }
	    
	    public static void main(String[] args) {
	        System.out.println("Cube volume: " + calculateVolume(3.0));
	        System.out.println("Rectangular prism volume: " + calculateVolume(2.0, 3.0, 4.0));
	        System.out.println("Sphere volume: " + calculateVolume(5.0, "sphere"));
	    }
	
	
}
