// Superclass Vehicle
package upCasting;

class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is driving on the road");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is pedaling on the path");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        // Upcasting - assigning subclass objects to superclass references
        Vehicle vehicle1 = new Car();  // Car upcast to Vehicle
        Vehicle vehicle2 = new Bike(); // Bike upcast to Vehicle
        
        // Calling move() method - polymorphism in action
        vehicle1.move();  // Calls Car's move()
        vehicle2.move();  // Calls Bike's move()
    }
}