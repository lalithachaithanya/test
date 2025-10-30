package constructor_8;

public class Student {

	String name;
	int rollnumber;
	char grade;
	
	public Student(String name , int rollnumber , char grade) {
		// TODO Auto-generated constructor stub
		
		this.name= name ;
		this.rollnumber= rollnumber;
		this.grade = grade;
	}
	public void displayDetails() {
		
		System.out.println(" The name "+name);
		System.out.println(" The rollnumber "+rollnumber);
		System.out.println(" the grade "+grade);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student details = new Student("Gokul" , 10 , 'A');
		details.displayDetails();
		
	}

}
