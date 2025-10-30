package Oops_9;

public class Vehicle {

	// Base class
	
	    String brand;

	    public Vehicle(String brand) {
	        this.brand = brand;
	    }

	    public void displayBrand() {
	        System.out.println("Brand: " + brand);
	    }
	}

	// Intermediate class inheriting from Vehicle
	class Car extends Vehicle {
	    String model;

	    public Car(String brand, String model) {
	        super(brand);
	        this.model = model;
	    }

	    public void displayModel() {
	        displayBrand(); // Call to parent class method
	        System.out.println("Model: " + model);
	    }
	}

	// Subclass inheriting from Car
	class ElectricCar extends Car {
	    int batteryCapacity;

	    public ElectricCar(String brand, String model, int batteryCapacity) {
	        super(brand, model);
	        this.batteryCapacity = batteryCapacity;
	    }

	    public void displayElectricCarInfo() {
	        displayModel(); // Call to parent class method
	        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
	    }
	    
	    public static void main(String[] args) {
	    	ElectricCar e_car =  new ElectricCar("MAHENDRA" , "B6" ,500);
	    	e_car.displayElectricCarInfo();
	    	
		}
	}
