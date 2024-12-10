package Automation.Selenium;

public class DBCustomerAccount  {

	public static void main(String[] args) {
		
		DBCustomerBankDetails person1 = new DBCustomerBankDetails(500);
		DBCustomerBankDetails person2 = new DBCustomerBankDetails(300);
		
		System.out.println("Initial Account Balance");
		System.out.println("Account person 1: " + person1.getBalance());
		System.out.println("Account person 2: " + person2.getBalance());

		DBSecureTransfer.transfer(person1, person2, 100);

		System.out.println("After Transacation Account Balance");
		System.out.println("Account person 1: " + person1.getBalance());
		System.out.println("Account person 2: " + person2.getBalance());
	}
}
