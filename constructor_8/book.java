package constructor_8;

public class book {
	
	 
	private String title;
	private String autour;
	private double price;
	
public book() {
	// TODO Auto-generated constructor stub
	title = "unknown";
	autour = "unknown";
	price = 0.0;
}
public void displayDetails() {
	
	System.out.println("Tile of a book " +title);
	System.out.println("Autour of the book "+autour);
	System.out.println("Price of the "+price);
	
     }




public static void main(String[] args) {
		
		book bookdetails = new book();
		bookdetails.displayDetails();
		
		
	}
}
