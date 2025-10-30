package Oops_9;

public class vehicleInterface {
	// Base class
	
	    public void run() {
	        System.out.println("Vehicle is running");
	    }
	}

	// Class implementing interface and extending Vehicle
	class Car_vandi extends vehicleInterface implements Engine {
	    @Override
	    public void start() {
	        System.out.println("Car engine started");
	    }

	    public void drive() {
	        start(); // Call to implemented interface method
	        run();   // Call to inherited method
	    }
	    public static void main(String[] args) {
			
	    	Car_vandi car = new Car_vandi();
	    	car.drive();
		}
	
}
