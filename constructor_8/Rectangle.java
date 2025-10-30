package constructor_8;

public class Rectangle {
	
	long length; long width;
	
	public Rectangle() {   
		// TODO Auto-generated constructor stub
		
		this.length = 1;
		this.width = 1;
	}
	
	public Rectangle(long length , long width) {
		// TODO Auto-generated constructor stub
		
		this.length = length;
		this.width = width;
	}
	
	// Method to calculate area
    public double calculateArea() {
        return length * width;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangleobj = new Rectangle();
		System.out.println("Area of default rectangle: " + rectangleobj.calculateArea());
		
		Rectangle rectangleobject1 = new Rectangle(5l , 5l);
		
		System.out.println("Area of default rectangle: " +rectangleobject1.calculateArea());
		
	}

}
