package downCasting;
//Superclass Device
class Device {
 public void turnOn() {
     System.out.println("Device is turning on");
 }
}

//Subclass Smartphone
class Smartphone extends Device {
 @Override
 public void turnOn() {
     System.out.println("Smartphone is booting up");
 }
 
 // Smartphone-specific method
 public void makeCall() {
     System.out.println("Smartphone is making a call");
 }
}

//Subclass Laptop
class Laptop extends Device {
 @Override
 public void turnOn() {
     System.out.println("Laptop is starting up");
 }
 
 // Laptop-specific method
 public void openLid() {
     System.out.println("Laptop lid is opening");
 }
}

public class DeviceDemo {
 public static void main(String[] args) {
     // Upcasting - Smartphone to Device reference
     Device myDevice = new Smartphone();
     
     // Calling overridden method
     myDevice.turnOn();  // Calls Smartphone's turnOn()
     
     // Downcasting - Device back to Smartphone
     if (myDevice instanceof Smartphone) {
         Smartphone myPhone = (Smartphone) myDevice;
         myPhone.makeCall();  // Calls Smartphone-specific method
     }
     
     // Example with Laptop
     Device anotherDevice = new Laptop();
     anotherDevice.turnOn();  // Calls Laptop's turnOn()
     
     if (anotherDevice instanceof Laptop) {
         Laptop myLaptop = (Laptop) anotherDevice;
         myLaptop.openLid();  // Calls Laptop-specific method
     }
 }
}