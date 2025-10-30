package Oops_9;

public class BankAccount {

	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance) {
		// TODO Auto-generated constructor stub
		this.accountNumber = accountNumber;
		this.balance = balance;
	
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount >0) {
			balance += amount;
			System.out.println("Deposit  "+ amount);
		}else {
			System.out.println("Deposit amount not in negative");
		}
		
	}
	public void Withdraw(double amount) {
		 if (amount <= 0) {
			 System.out.println("Withdrawal amount must be positive.");
	    }
		/*
		 * if(balance -= amount) { System.out.println("Withdrawal successful"); }
		 */
	}
	 public void displayAccountInfo() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Current Balance: " + balance);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount myAccount = new BankAccount("123456789", 1000.00);

        // Display initial account info
        myAccount.displayAccountInfo();
        System.out.println();

        // Perform transactions
        myAccount.deposit(500.00);
        myAccount.Withdraw(200.00);
        myAccount.Withdraw(1500.00); // Should fail - insufficient funds
        myAccount.deposit(-100.00);  // Should fail - invalid amount

        // Display final account info
        System.out.println();
        myAccount.displayAccountInfo();


	}

}
