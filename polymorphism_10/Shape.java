package polymorphism_10;

public class Shape {
	
	    public void draw() {
	        System.out.println("Drawing a shape");
	    }
	}

	class Circle extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a circle ○");
	    }
	}

	class Rectangle extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a rectangle ▭");
	    }
	}

	class Triangle extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a triangle △");
	    }


	    public static void main(String[] args) {
	        Shape shape = new Shape();
	        Shape circle = new Circle();
	        Shape rectangle = new Rectangle();
	        Shape triangle = new Triangle();
	        
	        shape.draw();
	        circle.draw();
	        rectangle.draw();
	        triangle.draw();
	    }
	}