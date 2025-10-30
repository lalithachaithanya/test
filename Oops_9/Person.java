package Oops_9;

public class Person{

	// Base class
	
	    String name;
	    int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	}

	// Subclass inheriting from Person
	class Employee extends Person {
	    int employeeId;

	    public Employee(String name, int age, int employeeId) {
	        super(name, age); // Call to Person constructor
	        this.employeeId = employeeId;
	    }

	    public void displayEmployeeInfo() {
	        displayInfo(); // Call to parent class method
	        System.out.println("Employee ID: " + employeeId);
	    }
	    
	    public static void main(String[] args) {
			
	    	Employee employee = new Employee("ALEX" , 31 , 39);
	    	employee.displayEmployeeInfo();
	    	
		}
	}
	
	
