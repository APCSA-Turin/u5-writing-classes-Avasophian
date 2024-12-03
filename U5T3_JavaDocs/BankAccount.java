package U5T3_JavaDocs;

/**
 * This class represents a bank account.
 * 
 * @author Sophie
 */

public class BankAccount{
   
    /** The type of account */
    private String accountType;
    
    /** The balance of the account */
    private double balance;
 
 
    /**Instantiates a BankAccount object.
     * 
     * @param accountType The type of account
     * @param balance The balance of the account
     */
    public BankAccount(String accountType, double balance)
    {
        this.accountType = accountType;
        this.balance = balance;
    }
 
 
    /**
     * Returns the balance of the account
     * @return The balance of the account.
     */
    public double getBalance()
    {
      return balance;
    }
   
 
 
    /**
     * Void method that adds the given amount to the balance, then rounds the balance.
     * @param amount The amount being deposited
     */
    public void deposit(double amount)
    {
        balance += amount;
        balance = Math.round(balance * 100)/100.0;
    }
 
 
    /**
     * Void method that subtracts the given amount from the balance, then rounds the balance.
     * <p>
     * PRECONDITION : The balance of the account once the amount is withdrawn is still greater than 0
     * @param amount The amount being withdrawn
     */
    public void withdraw(double amount)
    {
        double oldBalance = balance;
        balance -= amount;
        balance = Math.round(balance * 100)/100.0;
        if (balance < 0)
        {
           balance = oldBalance;
        }
    }
 
    /**
     * Void method that prints the balance of the account
     */
    public void checkBalance()
    {
      System.out.println("Your " + accountType + " account balance is: $" + balance);
    }
 }
 
