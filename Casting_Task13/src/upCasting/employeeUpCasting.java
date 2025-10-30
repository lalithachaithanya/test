package upCasting;

//Superclass Employee
class Employee {
	public void work() {
		System.out.println("Employee is working");
	}
}

//Subclass Manager
class Manager extends Employee {
	@Override
	public void work() {
		System.out.println("Manager is managing the team");
	}
}

//Subclass Developer
class Developer extends Employee {
	@Override
	public void work() {
		System.out.println("Developer is writing code");
	}
}

public class employeeUpCasting {
	public static void main(String[] args) {
		// Upcasting - assigning subclass objects to superclass references
		Employee emp1 = new Manager(); // Manager upcast to Employee
		Employee emp2 = new Developer(); // Developer upcast to Employee

		// Calling work() method - polymorphism in action
		emp1.work(); // Calls Manager's work()
		emp2.work(); // Calls Developer's work()

		// You can also create an array of Employees containing different types
		Employee[] team = new Employee[3];
		team[0] = new Manager();
		team[1] = new Developer();
		team[2] = new Employee();

		System.out.println("\nTeam at work:");
		for (Employee emp : team) {
			emp.work(); // Each calls their appropriate work() method
		}
	}
}
