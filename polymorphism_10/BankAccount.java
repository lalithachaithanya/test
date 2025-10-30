package polymorphism_10;

public class BankAccount {

	    protected String accountNumber;
	    protected double balance;
	    
	    public BankAccount(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }
	    
	    public void calculateInterest() {
	        System.out.println("No interest for basic bank account");
	    }
	    
	    public void displayBalance() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: $" + balance);
	    }
	}

	class SavingsAccount extends BankAccount {
	    private static final double INTEREST_RATE = 0.03; // 3%
	    
	    public SavingsAccount(String accountNumber, double balance) {
	        super(accountNumber, balance);
	    }
	    
	    @Override
	    public void calculateInterest() {
	        double interest = balance * INTEREST_RATE;
	        balance += interest;
	        System.out.println("Interest earned: $" + interest);
	    }
	}

	class CurrentAccount extends BankAccount {
	    private static final double INTEREST_RATE = 0.01; // 1%
	    
	    public CurrentAccount(String accountNumber, double balance) {
	        super(accountNumber, balance);
	    }
	    
	    @Override
	    public void calculateInterest() {
	        double interest = balance * INTEREST_RATE;
	        balance += interest;
	        System.out.println("Interest earned: $" + interest);
	    }
	
	    public static void main(String[] args) {
	        BankAccount account1 = new BankAccount("BA1001", 1000);
	        SavingsAccount account2 = new SavingsAccount("SA2001", 5000);
	        CurrentAccount account3 = new CurrentAccount("CA3001", 3000);
	        
	        account1.displayBalance();
	        account1.calculateInterest();
	        System.out.println();
	        
	        account2.displayBalance();
	        account2.calculateInterest();
	        account2.displayBalance();
	        System.out.println();
	        
	        account3.displayBalance();
	        account3.calculateInterest();
	        account3.displayBalance();
	    }
	}
