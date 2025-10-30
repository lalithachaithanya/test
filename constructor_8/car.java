package constructor_8;

public class car {
		
		 private String maker; String model; int year;
		  
		  public car() { // TODO Auto-generated constructor stub
		  
		  maker = "unknown"; model = "unknown"; year = 0; 
		  }
		  
		  public void displayDetals() {
		  
		  System.out.println("The car maker " + maker);
		  System.out.println("The model of the car " + model);
		  System.out.println("The year of making " + year); 
		  }	  
	public static void main(String[] args) {
		
		car cardetails = new car();
		cardetails.displayDetals();
	}

	
	}  
		  

