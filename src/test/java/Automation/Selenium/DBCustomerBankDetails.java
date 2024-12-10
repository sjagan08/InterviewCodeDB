package Automation.Selenium;

public class DBCustomerBankDetails {

	private int balance;
	
	public DBCustomerBankDetails(int initialBalance) {
		this.balance = initialBalance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void debit(int amount) {
		if(balance < amount) {
			throw new IllegalArgumentException("Insufficient Balance");
		}
		balance -= amount;
	}
	
	public void credit(int amount) {
		balance += amount;
	}
	
}
