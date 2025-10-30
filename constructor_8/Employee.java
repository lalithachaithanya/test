package constructor_8;

public class Employee {
		
	String name; String position; double salary;
	
	public Employee(String name , String position , double salary) {
		// TODO Auto-generated constructor stub
		
		this.name = name; 
		this.position = position; 
		this.salary = salary ;
	}
	public void displayDetails() {
		
		System.out.println("Employee name " +name);
		System.out.println("Employee position "+position);
		System.out.println("Employee salary "+ salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee details = new Employee("Gokul" , "Firstposition" , 10000 );
		details.displayDetails();
	}

}
