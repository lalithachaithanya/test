package polymorphism_10;   //POLYMORPHISH  //OVERRIDING

public class Employee {  //SUPER CLASS
	
	
	  protected String name; 
	  protected int id;
	 
	    
	    public Employee(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }
	    
	    public void displayDetails() {
	        System.out.println("Employee ID: " + id);
	        System.out.println("Name: " + name);
	    }
	}

	class Manager extends Employee {
	    private String department;
	    
	    public Manager(String name, int id, String department) {
	        super(name, id);
	        this.department = department;
	    }
	    
	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Position: Manager");
	        System.out.println("Department: " + department);
	    }
	}

	class Developer extends Employee {
	    private String programmingLanguage;
	    
	    public Developer(String name, int id, String programmingLanguage) {
	        super(name, id);
	        this.programmingLanguage = programmingLanguage;
	    }
	    
	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Position: Developer");
	        System.out.println("Programming Language: " + programmingLanguage);
	    }
	}

	class Intern extends Employee {
	    private int duration; // in months
	    
	    public Intern(String name, int id, int duration) {
	        super(name, id);
	        this.duration = duration;
	    }
	    
	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Position: Intern");
	        System.out.println("Duration in : " + duration + " months");
	    }

	    public static void main(String[] args) {
	        Employee emp = new Employee("John Doe", 1001);
	        Manager mgr = new Manager("Alice Smith", 2001, "IT");
	        Developer dev = new Developer("Bob Johnson", 3001, "Java");
	        Intern intern = new Intern("Charlie Brown", 4001, 6);
	        
	        emp.displayDetails();
	        System.out.println();
	        mgr.displayDetails();
	        System.out.println();
	        dev.displayDetails();
	        System.out.println();
	        intern.displayDetails();
	    } 
	    	
	    	//System.out.println("im current clss");
	    
	}
