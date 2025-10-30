package polymorphism_10;

public class Vehicle {

	    public void move() {
	        System.out.println("Vehicle is moving");
	    }
	}

	class Car extends Vehicle {
	    @Override
	    public void move() {
	        System.out.println("Car is driving on the road");
	    }
	}

	class Bike extends Vehicle {
	    @Override
	    public void move() {
	        System.out.println("Bike is riding on the street");
	    }
	}

	class Boat extends Vehicle {
	    @Override
	    public void move() {
	        System.out.println("Boat is sailing on water");
	    }
	
	    public static void main(String[] args) {
	        Vehicle vehicle = new Vehicle();
	        Vehicle car = new Car();
	        Vehicle bike = new Bike();
	        Vehicle boat = new Boat();
	        
	        vehicle.move();
	        car.move();
	        bike.move();
	        boat.move();
	    }
	}
