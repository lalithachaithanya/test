package interface_11;

public class CreditcardPayment implements payment{

	 private String cardNumber;
	    private String cardHolderName;
	    private String expirationDate;
	    private String cvv;
	    	
	    
	    public CreditcardPayment(String cardNumber,String cardHolderName, String expirationDate, String cvv) {
			// TODO Auto-generated constructor stub
	    	
	    	this.cardNumber = cardNumber;
	    	this.cardHolderName = cardHolderName;
	    	this.expirationDate = expirationDate;
	    	this.cvv = cvv;
	    	
		}


		@Override
		public void processPayment(double amount) {
			// TODO Auto-generated method stub
			
		System.out.println("amount "+ amount);
		System.out.println("Card Numberr" + cardNumber);
		System.out.println("Card Holder Name" + cardHolderName);
		System.out.println("Exp Date" + expirationDate);
		System.out.println("cvv " + cvv);
		}
	    
	    
}

class PaypalPayment implements payment{
 
	String email ;
	String password;
	
	
	public PaypalPayment(String email ,String password) {
		// TODO Auto-generated constructor stub
		this.email = email;
		this.password = password;
	}


	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Email Address " + email);
		
	}
	
public class paymentProcess{
	public static void main(String[] args) {
		
		
		payment CreditcardPayment = new CreditcardPayment("123456789" , "Gokul" , "1020" , "234");
		payment PaypalPayment = new PaypalPayment("Gokul@gmail.com" , "gokul@123");
		
		
		System.out.println("credit card payment");
		CreditcardPayment.processPayment(10000.0);
		
		System.out.println("paypal payments");
		PaypalPayment.processPayment(500.0);
		
	}
	}
}
