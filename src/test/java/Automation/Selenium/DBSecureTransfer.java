package Automation.Selenium;

public class DBSecureTransfer {

	public static void transfer(DBCustomerBankDetails from, DBCustomerBankDetails to, int amount) {
		if (from == to) {
			throw new IllegalArgumentException("Amount cannot be transfered to same account!");
		}

		if (from.getBalance() < amount) {
			throw new IllegalArgumentException("Insuffiecient Balance: " +from.getBalance());
		}

		DBCustomerBankDetails firstLock = from.hashCode() < to.hashCode() ? from : to;
		DBCustomerBankDetails secondLock = from.hashCode() < to.hashCode() ? to : from;

		synchronized (firstLock) {
			synchronized (secondLock) {
				from.debit(amount);
				to.credit(amount);
			}
		}

	}
}
