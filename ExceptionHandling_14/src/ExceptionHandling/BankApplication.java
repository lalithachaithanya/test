package ExceptionHandling;

import java.util.HashMap;
import java.util.Map;

//Custom Exceptions
class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}

class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

class AccountNotFoundException extends Exception {
 public AccountNotFoundException(String message) {
     super(message);
 }
}

class TransferException extends Exception {
 public TransferException(String message) {
     super(message);
 }
}

//Account Class
class Account {
 private String accountNumber;
 private double balance;

 public Account(String accountNumber, double initialBalance) throws InvalidAmountException {
     this.accountNumber = accountNumber;
     if (initialBalance < 0) {
         throw new InvalidAmountException("Initial balance cannot be negative");
     }
     this.balance = initialBalance;
 }

 public String getAccountNumber() {
     return accountNumber;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be positive");
     }
     balance += amount;
 }

 public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be positive");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient funds for withdrawal");
     }
     balance -= amount;
 }
}

//Banking Application Class
class BankingApplication {
 private Map<String, Account> accounts;

 public BankingApplication() {
     accounts = new HashMap<>();
 }

 // 1. Create Account
 public void createAccount(String accountNumber, double initialBalance) throws InvalidAmountException {
     if (accounts.containsKey(accountNumber)) {
         throw new IllegalArgumentException("Account number already exists");
     }
     Account newAccount = new Account(accountNumber, initialBalance);
     accounts.put(accountNumber, newAccount);
 }

 // 2. Deposit
 public void deposit(String accountNumber, double amount) throws InvalidAmountException, AccountNotFoundException {
     Account account = accounts.get(accountNumber);
     if (account == null) {
         throw new AccountNotFoundException("Account not found: " + accountNumber);
     }
     account.deposit(amount);
 }

 // 3. Withdraw
 public void withdraw(String accountNumber, double amount) throws InvalidAmountException, InsufficientFundsException, AccountNotFoundException {
     Account account = accounts.get(accountNumber);
     if (account == null) {
         throw new AccountNotFoundException("Account not found: " + accountNumber);
     }
     account.withdraw(amount);
 }

 // 4. Transfer
 public void transfer(String fromAccountNumber, String toAccountNumber, double amount) 
         throws TransferException, AccountNotFoundException, InvalidAmountException, InsufficientFundsException {
     if (fromAccountNumber.equals(toAccountNumber)) {
         throw new TransferException("Cannot transfer to the same account");
     }

     Account fromAccount = accounts.get(fromAccountNumber);
     if (fromAccount == null) {
         throw new AccountNotFoundException("Source account not found: " + fromAccountNumber);
     }

     Account toAccount = accounts.get(toAccountNumber);
     if (toAccount == null) {
         throw new AccountNotFoundException("Destination account not found: " + toAccountNumber);
     }

     try {
         fromAccount.withdraw(amount);
         toAccount.deposit(amount);
     } catch (InvalidAmountException | InsufficientFundsException e) {
         throw new TransferException("Transfer failed: " + e.getMessage());
     }
 }

 // 5. Account Details
 public String getAccountDetails(String accountNumber) throws AccountNotFoundException {
     Account account = accounts.get(accountNumber);
     if (account == null) {
         throw new AccountNotFoundException("Account not found: " + accountNumber);
     }
     return "Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance();
 }
}

//Main Class to Test the Banking Application
public class BankApplication {
 public static void main(String[] args) {
     BankingApplication bank = new BankingApplication();

     try {
         // Create accounts
         bank.createAccount("A123", 1000);
         bank.createAccount("B456", 500);

         // Deposit
         bank.deposit("A123", 200);
         System.out.println(bank.getAccountDetails("A123"));

         // Withdraw
         bank.withdraw("B456", 100);
         System.out.println(bank.getAccountDetails("B456"));

         // Transfer
         bank.transfer("A123", "B456", 300);
         System.out.println("After transfer:");
         System.out.println(bank.getAccountDetails("A123"));
         System.out.println(bank.getAccountDetails("B456"));

         // Test exceptions
         // bank.deposit("A123", -50); // Will throw InvalidAmountException
         // bank.withdraw("B456", 1000); // Will throw InsufficientFundsException
         // bank.transfer("A123", "C789", 100); // Will throw AccountNotFoundException
         // bank.getAccountDetails("X999"); // Will throw AccountNotFoundException

     } catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}

