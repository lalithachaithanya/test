package interface_11;

public class Circle implements Drawable{

	private double radius;
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		
		this.radius = radius;
	}
	
	@Override
	public void Drwa() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle with "+ radius);
		System.out.println("   ***   ");
        System.out.println(" *     * ");
        System.out.println("*       *");
        System.out.println(" *     * ");
        System.out.println("   ***   \n");
	}

	
}

class Rectangle implements Drawable{
	
	private double Rectangle;
	public Rectangle(double Rectangle) {
		// TODO Auto-generated constructor stub
		this.Rectangle = Rectangle;
	}

	@Override
	public void Drwa() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle with "+ Rectangle);
		 System.out.println("+-----------+");
	        System.out.println("|           |");
	        System.out.println("|           |");
	        System.out.println("|           |");
	        System.out.println("+-----------+\n");
	}

}    
class DrawableDemo{
	public static void main(String[] args) {
		Circle newCircle = new Circle(5.0);
		newCircle.Drwa();
	}
}
